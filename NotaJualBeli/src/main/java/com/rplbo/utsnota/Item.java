package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    public Pulpen[] {
        return pen;
    }

    public Item(BukuTulis[] bukuygdibeli, KertasHVS[] kertasygdibeli, Pulpen[] pulpenygdibeli) {
    }

    public KertasHVS getKrhvs() {
        return krhvs;
    }
    public BukuTulis getBktulis() {
        return bktulis;
    }
//    public int getJumlahBukuTulis() {
//        return bktulis;
//    }
//    public int getJumlahPen() {
//        return pen;
//    }
//    public int getJumlahKertasHVS() {
//        return krhvs;
//    }
}
