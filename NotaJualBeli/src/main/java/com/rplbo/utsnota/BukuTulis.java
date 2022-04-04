package com.rplbo.utsnota;

public class BukuTulis extend Barang {
    private String merk;

    public BukuTulis(String kode, int harga, int berat, String deskripsi, String merk) {
        this.kode = kode;
        this.harga = harga;
        this.berat = berat;
        this.deskripsi = deskripsi;
        this.merk = merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
//    public void getInformasi() {
//        return BukuTulis;
//    }
}
