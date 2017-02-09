package id.or.qodr.gsmarena.parser;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import id.or.qodr.gsmarena.DetailsProduct;
import id.or.qodr.gsmarena.adapter.ArrayAdapterFactory;
import id.or.qodr.gsmarena.adapter.BrandsAdapter;
import id.or.qodr.gsmarena.adapter.DetailsAdapter;
import id.or.qodr.gsmarena.adapter.ProductAdapter;
import id.or.qodr.gsmarena.model.AllBrandsModel;
import id.or.qodr.gsmarena.model.AllProductModel;
import id.or.qodr.gsmarena.model.DetailsProductModel;

/**
 * Created by adul on 13/01/17.
 */

public class BrandsData {

    private static final String LOG = "BrandsData";

    private DetailsProductModel.DataBean dataBean;
    private ArrayList<AllBrandsModel> brands = null;
    private ArrayList<AllProductModel> product = null;
    private Context context;
    private StaggeredGridLayoutManager layoutManager;
    private LinearLayoutManager linearManager;
    private ProgressDialog progress;

    public BrandsData(Context context) {
        this.context = context;
    }

    public void getAllBrands(final RecyclerView recyclerBrands, String URL) {
        JsonObjectRequest request = new JsonObjectRequest(URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    Gson gson = new GsonBuilder().registerTypeAdapterFactory(new ArrayAdapterFactory()).create();
                    ParsingResult result = gson.fromJson(response.toString(), ParsingResult.class);

                    brands = result.getDataBrands();
                    layoutManager = new StaggeredGridLayoutManager(2, GridLayoutManager.VERTICAL);

                    recyclerBrands.setHasFixedSize(true);
                    recyclerBrands.setLayoutManager(layoutManager);

                    final BrandsAdapter rcAdapter = new BrandsAdapter(context, brands);
                    recyclerBrands.setAdapter(rcAdapter);

                }catch (Exception e) {
                    Log.d("Exception", e.toString());
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                Log.d(LOG, error.toString());
            }
        }
        );

        RequestQueue queue = Volley.newRequestQueue(context);

        request.setRetryPolicy(new DefaultRetryPolicy(
                3000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(request);
    }

    public void getAllProduct (final RecyclerView recyclerProduct, String URL) {
        JsonObjectRequest request = new JsonObjectRequest(URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    Gson gson = new GsonBuilder().registerTypeAdapterFactory(new ArrayAdapterFactory()).create();
                    ParsingProduct result = gson.fromJson(response.toString(), ParsingProduct.class);

                    product = result.getDataProduct();
                    layoutManager = new StaggeredGridLayoutManager(2, GridLayoutManager.VERTICAL);

                    recyclerProduct.setHasFixedSize(true);
                    recyclerProduct.setLayoutManager(layoutManager);

                    ProductAdapter rcAdapter = new ProductAdapter(context, product);
                    recyclerProduct.setAdapter(rcAdapter);

                }catch (Exception e) {
                    Log.d("Exception", e.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                Log.d(LOG, error.toString());
            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(context);

        request.setRetryPolicy(new DefaultRetryPolicy(
                3000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(request);
    }


}
