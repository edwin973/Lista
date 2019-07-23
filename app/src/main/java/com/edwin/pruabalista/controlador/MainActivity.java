package com.edwin.pruabalista.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.edwin.pruabalista.Adapter;
import com.edwin.pruabalista.R;
import com.edwin.pruabalista.modelo.ItemInfoObjeto;
import com.edwin.pruabalista.modelo.ItemManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Adapter adapter;
    ItemManager itemManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lista);
        adapter=new Adapter(this,getItems());
        listView.setAdapter(adapter);
    }

    public ArrayList<ItemInfoObjeto> getItems(){
        ArrayList<ItemInfoObjeto> datosItem = new ArrayList<ItemInfoObjeto>();

        ItemInfoObjeto dato1 = new ItemInfoObjeto("Item 1","Sena",2.483117, -76.561984,241564);
        ItemInfoObjeto dato2 = new ItemInfoObjeto("Item 2","Bello Horizonte",2.483117, -76.561984,241564);
        ItemInfoObjeto dato3 = new ItemInfoObjeto("Item 3","Paz",2.483117, -76.561984,241564);


            datosItem.add(dato1);
            datosItem.add(dato2);
            datosItem.add(dato3);

            return datosItem;


    }
}
