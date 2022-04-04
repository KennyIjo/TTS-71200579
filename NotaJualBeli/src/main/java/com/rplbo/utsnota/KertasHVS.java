package com.rplbo.utsnota;

public class KertasHVS extend Barang{
    private int gram;

    public KertasHVS (String kode, int harga, int berat, String deskripsi, int gram) {
        this.kode = kode;
        this.harga = harga;
        this.berat = berat;
        this.deskripsi = deskripsi;
        this.gram = gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }
    public int getGram() {
        return gram;
    }
//    public void getInformasi() {
//        return KertasHVS;
//    }
}
