package id.or.qodr.gsmarena.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import id.or.qodr.gsmarena.R;
import id.or.qodr.gsmarena.model.DetailsProductModel;

/**
 * Created by adul on 17/01/17.
 */

public class DetailsAdapter extends RecyclerView.Adapter<VHDetails> {

    private DetailsProductModel.DataBean dataBean;
    private Context context;

    public DetailsAdapter(Context context, DetailsProductModel.DataBean dataBean) {
        this.dataBean = dataBean;
        this.context = context;
    }

    @Override
    public VHDetails onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_details_product,null);
        VHDetails rcv = new VHDetails(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(VHDetails holder, int position) {
        holder.titleDetail.setText(dataBean.getNetwork().getTechnology().toString());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
