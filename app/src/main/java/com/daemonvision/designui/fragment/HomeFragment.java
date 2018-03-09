package com.daemonvision.designui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.daemonvision.designui.R;
import com.daemonvision.designui.adapters.AdapaterGridView;
import com.daemonvision.designui.adapters.AdapterGridViewItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ArrayList<AdapterGridViewItem> data = new ArrayList<>();
    GridView gridview;
    AdapaterGridView gridviewAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        this.gridview = (GridView) v.findViewById(R.id.gridView1);
        this.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    //startActivity(new Intent(getContext(), ActivityMenuCategory.class));
                }
            }
        });
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_product), ContextCompat.getDrawable(getActivity(), R.drawable.ic_product)));
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_cart), ContextCompat.getDrawable(getActivity(), R.drawable.ic_cart)));
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_checkout), ContextCompat.getDrawable(getActivity(), R.drawable.ic_checkout)));
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_info), ContextCompat.getDrawable(getActivity(), R.drawable.ic_info)));
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_profile), ContextCompat.getDrawable(getActivity(), R.drawable.ic_profile)));
        this.data.add(new AdapterGridViewItem(getResources().getString(R.string.menu_about), ContextCompat.getDrawable(getActivity(), R.drawable.ic_about)));
        setDataAdapter();
        return v;
    }

    private void setDataAdapter() {
        this.gridviewAdapter = new AdapaterGridView(getActivity(), R.layout.lsv_item_category, this.data);
        this.gridview.setAdapter(this.gridviewAdapter);
    }


}
