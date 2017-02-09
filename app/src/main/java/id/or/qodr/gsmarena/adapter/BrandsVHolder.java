package id.or.qodr.gsmarena.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import id.or.qodr.gsmarena.R;

/**
 * Created by adul on 13/01/17.
 */
public class BrandsVHolder extends RecyclerView.ViewHolder {

    public TextView title, count, slug;

    public BrandsVHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.idTitle);
        count = (TextView) itemView.findViewById(R.id.idCount);
        slug = (TextView) itemView.findViewById(R.id.idSlug);
    }
}
