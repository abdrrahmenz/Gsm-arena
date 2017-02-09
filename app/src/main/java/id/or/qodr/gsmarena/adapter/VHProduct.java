package id.or.qodr.gsmarena.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.or.qodr.gsmarena.R;

/**
 * Created by adul on 14/01/17.
 */
public class VHProduct extends RecyclerView.ViewHolder{

    public TextView title, slug;
    public ImageView img;

    public VHProduct(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.titleProduct);
        slug = (TextView) itemView.findViewById(R.id.slugProduct);
        img = (ImageView) itemView.findViewById(R.id.idImageProduct);
    }
}
