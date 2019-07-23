package com.edwin.pruabalista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.edwin.pruabalista.modelo.ItemInfoObjeto;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<ItemInfoObjeto> list;

    public Adapter(Context context, ArrayList list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemInfoObjeto da = (ItemInfoObjeto) getItem(i);

        view = LayoutInflater.from(context).inflate(R.layout.item,null);

        ImageView cat = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.nombre);
        TextView dir= view.findViewById(R.id.direccion);


        //cat.setImageResource(da.getImgCategoria());
        dir.setText(da.getDireccionItem());
        textView.setText(da.getNombreItem());
        return view;

    }
}
