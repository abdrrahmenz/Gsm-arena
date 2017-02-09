package id.or.qodr.gsmarena.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import id.or.qodr.gsmarena.AllProduct;
import id.or.qodr.gsmarena.DetailsProduct;
import id.or.qodr.gsmarena.R;
import id.or.qodr.gsmarena.model.AllProductModel;

/**
 * Created by adul on 14/01/17.
 */

public class ProductAdapter extends RecyclerView.Adapter<VHProduct> {

    private List<AllProductModel> productList;
    private Context context;

    public ProductAdapter(Context context, List<AllProductModel> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public VHProduct onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_all_product,null);
        VHProduct rcv = new VHProduct(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(VHProduct holder, final int position) {
        holder.title.setText(productList.get(position).title);
        holder.slug.setText(productList.get(position).slug);
        Glide.with(context).load(productList.get(position).img).into(holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsProduct.class);
                intent.putExtra("idSlugDetails", productList.get(position).slug);
                context.startActivity(intent);
                Toast.makeText(context, "click : "+productList.get(position).slug, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
