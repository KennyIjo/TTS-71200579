package com.rplbo;

import static com.rplbo.Perempuan.*;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private String jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
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
    public void setJodoh(String jodoh) {
        this.jodoh = jodoh;
    }
    public String getJodoh() {
        return jodoh;
    }
    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void PDKT (Perempuan calon) {
        temanKencan = calon;
    }
    public void MengajakKencan (Perempuan perempuan) {
        if (temanKencan != null) {
            jumlahCinta = jumlahCinta + 1;
        }
        else {
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJA CEWEK LAIN JALAN!!");
        }

    }
    public void MenembakKekasih() {
        if (jumlahCinta > getTemanKencan().getStandarJumlahCinta()) {
            status = temanKencan.getStatus();
            jodoh = temanKencan.getNama();
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU " + nama);
        } else if(temanKencan == null) {
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH " + nama + "!!!");
        }
    }
}
