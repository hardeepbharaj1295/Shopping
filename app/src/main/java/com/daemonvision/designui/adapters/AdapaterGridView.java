package com.daemonvision.designui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.daemonvision.designui.R;

import java.util.ArrayList;

/**
 * Created by admin on 02/25/18.
 */

public class AdapaterGridView extends ArrayAdapter<AdapterGridViewItem> {
    private ArrayList<AdapterGridViewItem> data = new ArrayList<>();
    private Context mContext;
    private int resourceId;

    static class ViewHolder {
        ImageView imgItem;
        TextView txtItem;

        ViewHolder() {
        }
    }

    public AdapaterGridView(Context context, int layoutResourceId, ArrayList<AdapterGridViewItem> data) {
        super(context, layoutResourceId, data);
        this.mContext = context;
        this.resourceId = layoutResourceId;
        this.data = data;
    }

    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        View itemView = convertView;
        if (itemView == null) {
            itemView = ((LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(this.resourceId, parent, false);
            holder = new ViewHolder();
            holder.imgItem = (ImageView) itemView.findViewById(R.id.thumbnails);
            holder.txtItem = (TextView) itemView.findViewById(R.id.name);
            itemView.setTag(holder);
        } else {
            holder = (ViewHolder) itemView.getTag();
        }
        AdapterGridViewItem item = (AdapterGridViewItem) getItem(position);
        assert item != null;
        holder.imgItem.setImageDrawable(item.getImage());
        holder.txtItem.setText(item.getTitle());
        return itemView;
    }
}
