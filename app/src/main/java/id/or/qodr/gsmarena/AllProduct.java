package id.or.qodr.gsmarena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import id.or.qodr.gsmarena.adapter.ArrayAdapterFactory;
import id.or.qodr.gsmarena.model.AllBrandsModel;
import id.or.qodr.gsmarena.model.AllProductModel;
import id.or.qodr.gsmarena.parser.BrandsData;

public class AllProduct extends AppCompatActivity {

    private RecyclerView rvProduct;
    private BrandsData brandsData;
    private List<AllProductModel> product;
    private String URL_LIST_PRODUCT = "http://ibacor.com/api/gsm-arena?view=brand&slug=";
    private String URL_END = "&page=1";
    private String slugReq = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            slugReq = extras.getString("idSlug");
        }

        product = new ArrayList<AllProductModel>();
        brandsData = new BrandsData(this);

        rvProduct = (RecyclerView) findViewById(R.id.rcvProduct);

        brandsData.getAllProduct(rvProduct,URL_LIST_PRODUCT + slugReq + URL_END);
    }
}
