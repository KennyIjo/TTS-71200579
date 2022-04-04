package com.rplbo.utsnota;

public class Pulpen {
    private String warna;

    public Barang extend Pulpen (String kode, int harga, int berat, String deskripsi, String warna) {
        this.kode = kode;
        this.harga = harga;
        this.berat = berat;
        this.deskripsi = deskripsi;
        this.warna = warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
//    public void getInformasi() {
//        return Pulpen;
//    }
}
