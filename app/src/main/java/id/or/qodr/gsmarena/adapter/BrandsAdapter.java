package id.or.qodr.gsmarena.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import id.or.qodr.gsmarena.AllProduct;
import id.or.qodr.gsmarena.R;
import id.or.qodr.gsmarena.model.AllBrandsModel;

/**
 * Created by adul on 13/01/17.
 */

public class BrandsAdapter extends RecyclerView.Adapter<BrandsVHolder> {

    private List<AllBrandsModel> brandsList;
    private Context context;

    public BrandsAdapter(Context context, List<AllBrandsModel> brandsList) {
        this.context = context;
        this.brandsList = brandsList;
    }

    @Override
    public BrandsVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_all_brands,null);
        BrandsVHolder rcv = new BrandsVHolder(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(BrandsVHolder holder, final int position) {

        holder.title.setText(brandsList.get(position).title);
        holder.count.setText(brandsList.get(position).count);
        holder.slug.setText(brandsList.get(position).slug);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AllProduct.class);
                intent.putExtra("idSlug", brandsList.get(position).slug);
                context.startActivity(intent);
                Toast.makeText(context, "click : "+brandsList.get(position).slug, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return brandsList.size();
    }
}
