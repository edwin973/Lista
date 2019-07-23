package com.edwin.pruabalista.modelo;

import android.database.Cursor;

import java.util.ArrayList;

public class ItemManager {

    ArrayList<ItemInfoObjeto> datosItem = new ArrayList<ItemInfoObjeto>();

    ItemInfoObjeto dato1 = new ItemInfoObjeto("Item 1","Sena",2.483117, -76.561984,241564);
    ItemInfoObjeto dato2 = new ItemInfoObjeto("Item 2","Bello Horizonte",2.483117, -76.561984,241564);
    ItemInfoObjeto dato3 = new ItemInfoObjeto("Item 3","Paz",2.483117, -76.561984,241564);

    public ArrayList<ItemInfoObjeto> InsertarDatos (){
        datosItem.add(dato1);
        datosItem.add(dato2);
        datosItem.add(dato3);

        return datosItem;
    }




}
