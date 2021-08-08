package com.ramdhanjr690.ai.fuzzy;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NilaiKelayakan {

    private static boolean rendah = true;

    public Map<String, Double> filterNK(Map<String, Double> mapIpk, Map<String, Double> mapGaji) {
        double ipkBuruk = mapIpk.get("ipk buruk") != 0.0 ? mapIpk.get("ipk buruk") : 0.0;
        double ipkBuruk2 = mapIpk.get("ipk buruk") != 0.0 ? mapIpk.get("ipk buruk") : 0.0;
        double ipkBuruk3 = mapIpk.get("ipk buruk") != 0.0 ? mapIpk.get("ipk buruk") : 0.0;
        double ipkBuruk4 = mapIpk.get("ipk buruk") != 0.0 ? mapIpk.get("ipk buruk") : 0.0;

        double ipkCukup = mapIpk.get("ipk cukup") != 0.0 ? mapIpk.get("ipk cukup") : 0.0;
        double ipkCukup2 = mapIpk.get("ipk cukup") != 0.0 ? mapIpk.get("ipk cukup") : 0.0;
        double ipkCukup3 = mapIpk.get("ipk cukup") != 0.0 ? mapIpk.get("ipk cukup") : 0.0;
        double ipkCukup4 = mapIpk.get("ipk cukup") != 0.0 ? mapIpk.get("ipk cukup") : 0.0;

        double ipkBagus = mapIpk.get("ipk bagus") != 0.0 ? mapIpk.get("ipk bagus") : 0.0;
        double ipkBagus2 = mapIpk.get("ipk bagus") != 0.0 ? mapIpk.get("ipk bagus") : 0.0;
        double ipkBagus3 = mapIpk.get("ipk bagus") != 0.0 ? mapIpk.get("ipk bagus") : 0.0;
        double ipkBagus4 = mapIpk.get("ipk bagus") != 0.0 ? mapIpk.get("ipk bagus") : 0.0;

        double gajiKecil = mapGaji.get("gaji kecil") != 0.0 ? mapGaji.get("gaji kecil") : 0.0;
        double gajiSedang = mapGaji.get("gaji sedang") != 0.0 ? mapGaji.get("gaji sedang") : 0.0;
        double gajiBesar = mapGaji.get("gaji besar") != 0.0 ? mapGaji.get("gaji besar") : 0.0;
        double gajiSangatBesar = mapGaji.get("gaji sangat besar") != 0.0 ? mapGaji.get("gaji sangat besar") : 0.0;
        String keterangan;

        Map<String, Double> filterNK = new LinkedHashMap<>();

        // Perkondisian ipk buruk
        if (ipkBuruk != 0.0 && gajiKecil != 0.0) {
            keterangan = "ipk buruk & gaji kecil : ";
            if (ipkBuruk > gajiKecil) {
                filterNK.put(keterangan + "rendah", gajiKecil);
            } else {
                filterNK.put(keterangan + "rendah", ipkBuruk);
            }
        }

        if (ipkBuruk2 != 0.0 && gajiSedang != 0.0) {
            keterangan = "ipk buruk & gaji sedang : ";
            if (ipkBuruk2 > gajiSedang) {
                filterNK.put(keterangan + "rendah", gajiSedang);
            } else {
                filterNK.put(keterangan + "rendah", ipkBuruk2);
            }
        }

        if (ipkBuruk3 != 0.0 && gajiBesar != 0.0) {
            keterangan = "ipk buruk & gaji besar : ";
            if (ipkBuruk3 > gajiBesar) {
                filterNK.put(keterangan + "rendah", gajiBesar);
            } else {
                filterNK.put(keterangan + "rendah", ipkBuruk3);
            }
        }

        if (ipkBuruk4 != 0.0 && gajiSangatBesar != 0.0) {
            keterangan = "ipk buruk & gaji sangat besar : ";
            if (ipkBuruk4 > gajiSangatBesar) {
                filterNK.put(keterangan + "rendah", gajiSangatBesar);
            } else {
                filterNK.put(keterangan, ipkBuruk4);
            }
        }

        // Perkondisian ipk cukup
        if (ipkCukup != 0.0 && gajiKecil != 0.0) {
            keterangan = "ipk cukup & gaji kecil : ";
            if (ipkCukup > gajiKecil) {
                filterNK.put(keterangan + "tinggi", gajiKecil);
            } else {
                filterNK.put(keterangan + "tinggi", ipkCukup);
            }
        }

        if (ipkCukup2 != 0.0 && gajiSedang != 0.0) {
            keterangan = "ipk cukup & gaji sedang : ";
            if (ipkCukup2 > gajiSedang) {
                filterNK.put(keterangan + "rendah", gajiSedang);
            } else {
                filterNK.put(keterangan + "rendah", ipkCukup2);
            }
        }

        if (ipkCukup3 != 0.0 && gajiBesar != 0.0) {
            keterangan = "ipk cukup & gaji besar : ";
            if (ipkCukup3 > gajiBesar) {
                filterNK.put(keterangan + "rendah", gajiBesar);
            } else {
                filterNK.put(keterangan + "rendah", ipkCukup3);
            }
        }

        if (ipkCukup4 != 0.0 && gajiSangatBesar != 0.0) {
            keterangan = "ipk cukup & gaji sangat besar : ";
            if (ipkCukup4 > gajiSangatBesar) {
                filterNK.put(keterangan + "rendah", gajiSangatBesar);
            } else {
                filterNK.put(keterangan + "rendah", ipkCukup4);
            }
        }

        // Perkondisian ipk bagus
        if (ipkBagus != 0.0 && gajiKecil != 0.0) {
            keterangan = "ipk bagus & gaji kecil : ";
            if (ipkBagus > gajiKecil) {
                filterNK.put(keterangan + "tinggi", gajiKecil);
            } else {
                filterNK.put(keterangan + "tinggi", ipkBagus);
            }
        }

        if (ipkBagus2 != 0.0 && gajiSedang != 0.0) {
            keterangan = "ipk bagus & gaji sedang : ";
            if (ipkBagus2 > gajiSedang) {
                filterNK.put(keterangan + "tinggi", gajiSedang);
            } else {
                filterNK.put(keterangan + "tinggi", ipkBagus2);
            }
        }

        if (ipkBagus3 != 0.0 && gajiBesar != 0.0) {
            keterangan = "ipk bagus & gaji besar : ";
            if (ipkBagus3 > gajiBesar) {
                filterNK.put(keterangan + "tinggi", gajiBesar);
            } else {
                filterNK.put(keterangan + "tinggi", ipkBagus3);
            }
        }

        if (ipkBagus4 != 0.0 && gajiSangatBesar != 0.0) {
            keterangan = "ipk bagus & gaji sangat besar : ";
            if (ipkBagus4 > gajiSangatBesar) {
                filterNK.put(keterangan + "rendah", gajiSangatBesar);
            } else {
                filterNK.put(keterangan + "rendah", ipkBagus4);
            }
        }

        return filterNK;
    }

    public Map<String, Double> finalFiltering(Map<String, Double> mapNK) {
        Double brkKecil = mapNK.get("ipk buruk & gaji kecil : rendah") != null ? mapNK.get("ipk buruk & gaji kecil : rendah") : 0.0;
        Double brkSedang = mapNK.get("ipk buruk & gaji sedang : rendah") != null ? mapNK.get("ipk buruk & gaji sedang : rendah") : 0.0;
        Double brkBesar = mapNK.get("ipk buruk & gaji besar : rendah") != null ? mapNK.get("ipk buruk & gaji besar : rendah") : 0.0;
        Double brkSangatBesar = mapNK.get("ipk buruk & gaji sangat besar : rendah") != null ? mapNK.get("ipk buruk & gaji sangat besar : rendah") : 0.0;

        Double ckpKecil = mapNK.get("ipk cukup & gaji kecil : tinggi") != null ? mapNK.get("ipk cukup & gaji kecil : tinggi") : 0.0;
        Double ckpSedang = mapNK.get("ipk cukup & gaji sedang : rendah") != null ? mapNK.get("ipk cukup & gaji sedang : rendah") : 0.0;
        Double ckpBesar = mapNK.get("ipk cukup & gaji besar : rendah") != null ? mapNK.get("ipk cukup & gaji besar : rendah") : 0.0;
        Double ckpSangatBesar = mapNK.get("ipk cukup & gaji sangat besar : rendah") != null ? mapNK.get("ipk cukup & gaji sangat besar : rendah") : 0.0;

        Double bgsKecil = mapNK.get("ipk bagus & gaji kecil : tinggi") != null ? mapNK.get("ipk bagus & gaji kecil : tinggi") : 0.0;
        Double bgsSedang = mapNK.get("ipk bagus & gaji sedang : tinggi") != null ? mapNK.get("ipk bagus & gaji sedang : tinggi") : 0.0;
        Double bgsBesar = mapNK.get("ipk bagus & gaji besar : tinggi") != null ? mapNK.get("ipk bagus & gaji besar : tinggi") : 0.0;
        Double bgsSangatBesar = mapNK.get("ipk bagus & gaji sangat besar : rendah") != null ? mapNK.get("ipk bagus & gaji sangat besar : rendah") : 0.0;

        Map<String, Double> mapFinal = new LinkedHashMap<>();

        // Filtering final nilai terbesar dari nk rendah ipk buruk & ipk cukup & ipk bagus
        if (brkKecil >= brkSedang && brkKecil >= brkBesar && brkKecil >= brkSangatBesar && brkKecil >= ckpSedang && brkKecil >= ckpBesar && brkKecil >= ckpSangatBesar && brkKecil >= bgsSangatBesar) {
            mapFinal.put("rendah", brkKecil);
        } else if (brkSedang >= brkKecil && brkSedang >= brkBesar && brkSedang >= brkSangatBesar && brkSedang >= ckpSedang && brkSedang >= ckpBesar && brkSedang >= ckpSangatBesar && brkSedang >= bgsSangatBesar) {
            mapFinal.put("rendah", brkSedang);
        } else if (brkBesar >= brkKecil && brkBesar >= brkSedang && brkBesar >= brkSangatBesar && brkBesar >= ckpSedang && brkBesar >= ckpBesar && brkBesar >= ckpSangatBesar && brkBesar >= bgsSangatBesar) {
            mapFinal.put("rendah", brkBesar);
        } else if (brkSangatBesar >= brkKecil && brkSangatBesar >= brkSedang && brkSangatBesar >= brkBesar && brkSangatBesar >= ckpSedang && brkSangatBesar >= ckpBesar && brkSangatBesar >= ckpSangatBesar && brkSangatBesar >= bgsSangatBesar) {
            mapFinal.put("rendah", brkSangatBesar);
        } else if (ckpSedang >= brkKecil && ckpSedang >= brkSedang && ckpSedang >= brkBesar && ckpSedang >= brkSangatBesar && ckpSedang >= ckpBesar && ckpSedang >= ckpSangatBesar && ckpSedang >= bgsSangatBesar) {
            mapFinal.put("rendah", ckpSedang);
        } else if (ckpBesar >= brkKecil && ckpBesar >= brkSedang && ckpBesar >= brkBesar && ckpBesar >= brkSangatBesar && ckpBesar >= ckpSedang && ckpBesar >= ckpSangatBesar && ckpBesar >= bgsSangatBesar) {
            mapFinal.put("rendah", ckpBesar);
        } else if (ckpSangatBesar >= brkKecil && ckpSangatBesar >= brkSedang && ckpSangatBesar >= brkBesar && ckpSangatBesar >= brkSangatBesar && ckpSangatBesar >= ckpSedang && ckpSangatBesar >= ckpBesar && ckpSangatBesar >= bgsSangatBesar) {
            mapFinal.put("rendah", ckpSangatBesar);
        } else if (bgsSangatBesar >= brkKecil && bgsSangatBesar >= brkSedang && bgsSangatBesar >= brkBesar && bgsSangatBesar >= brkSangatBesar && bgsSangatBesar >= ckpSedang && bgsSangatBesar >= ckpBesar && bgsSangatBesar >= ckpSangatBesar) {
            mapFinal.put("rendah", bgsSangatBesar);
        }


        // Filtering final nilai terbesar dari nk tinggi ipk cukup & ipk bagus
        if (ckpKecil >= bgsKecil && ckpKecil >= bgsSedang && ckpKecil >= bgsBesar) {
            mapFinal.put("tinggi", ckpKecil);
        } else if (bgsKecil >= ckpKecil && bgsKecil >= bgsSedang && bgsKecil >= bgsBesar) {
            mapFinal.put("tinggi", bgsKecil);
        } else if (bgsSedang >= ckpKecil && bgsSedang >= bgsKecil && bgsSedang >= bgsBesar) {
            mapFinal.put("tinggi", bgsSedang);
        } else if (bgsBesar >= ckpKecil && bgsBesar >= bgsKecil && bgsBesar >= bgsSedang) {
            mapFinal.put("tinggi", bgsBesar);
        }

            return mapFinal;
        }
}