package com.rplbo.utsnota;

public class Barang {
    private String deskripsi;
    private String kode;
    private int harga;
    private int berat;

    public Barang (String kode, int harga, int berat, String deskripsi) {
        this.kode = kode;
        this.harga = harga;
        this.berat = berat;
        this.deskripsi = deskripsi;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }
    public int getBerat() {
        return berat;
    }
    public void setkode(String kode) {
        this.kode = kode;
    }
    public String getkode() {
        return kode;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
}
