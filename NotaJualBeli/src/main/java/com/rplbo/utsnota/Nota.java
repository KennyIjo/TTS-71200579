package com.rplbo.utsnota;

public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String namapembeli, String notelppembeli, Item items) {
        this.nonota = nonota;
        this.namapembeli = namapembeli;
        this.notelppembeli = notelppembeli;
        this.item;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }
    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }
    public void setNonota(String nonota) {
        this.nonota = nonota;
    }
    public String getNamapembeli() {
        return namapembeli;
    }
    public String getNotelppembeli() {
        return notelppembeli;
    }
    public String getNonota() {
        return nonota;
    }
    public void tampilNota() {

    }
    public int hitungTotalBayar() {

    }
}
