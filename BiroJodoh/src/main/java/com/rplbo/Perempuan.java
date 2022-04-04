package com.rplbo;

public class Perempuan {
//    public static double standarJumlahCinta;
//    public static String nama;
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private double standarJumlahCinta;

    public Perempuan(String nama, int usia, double standarJumlahCinta) {
        this.nama = nama;
        this.usia = usia;
        this.standarJumlahCinta = standarJumlahCinta;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }
    public int getUsia() {
        return usia;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }
    public double getJumlahCinta() {
        return jumlahCinta;
    }
    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }
    public Pria getJodoh() {
        return jodoh;
    }
    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }
    public Pria getTemanKencan() {
        return temanKencan;
    }
    public void setStandarJumlahCinta(double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }
    public double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public void MengajakKencan(Pria pria) {
        jumlahCinta = jumlahCinta + 0.5;
    }
}
