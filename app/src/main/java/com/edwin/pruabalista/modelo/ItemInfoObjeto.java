package com.edwin.pruabalista.modelo;

import java.util.ArrayList;

public class ItemInfoObjeto {

    private String nombreItem;
    private String direccionItem;
    private double latitudItem;
    private double longitudItem;
    private int logoItem;

    public ItemInfoObjeto() {
    }

    public ItemInfoObjeto(String nombreItem, String direccionItem, double latitudItem, double longitudItem, int logoItem) {
        this.nombreItem = nombreItem;
        this.direccionItem = direccionItem;
        this.latitudItem = latitudItem;
        this.longitudItem = longitudItem;
        this.logoItem = logoItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDireccionItem() {
        return direccionItem;
    }

    public void setDireccionItem(String direccionItem) {
        this.direccionItem = direccionItem;
    }

    public double getLatitudItem() {
        return latitudItem;
    }

    public void setLatitudItem(double latitudItem) {
        this.latitudItem = latitudItem;
    }

    public double getLongitudItem() {
        return longitudItem;
    }

    public void setLongitudItem(double longitudItem) {
        this.longitudItem = longitudItem;
    }

    public int getLogoItem() {
        return logoItem;
    }

    public void setLogoItem(int logoItem) {
        this.logoItem = logoItem;
    }


}
