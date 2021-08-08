package com.ramdhanjr690.ai.fuzzy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Ipk ipk = new Ipk();
    private static Gaji gaji = new Gaji();

    private static final Scanner scanner = new Scanner(System.in);
    private static Double hslBuruk, hslCukup, hslBagus;
    private static Double hslKecil, hslSedang, hslBesar, hslSangatBesar;
    private static String nama;
    private static int nim;

    public static void main(String[] args) {

//        System.out.print("Masukan nama : ");
//        nama = scanner.nextLine();
//
//        System.out.print("Masukan nim : ");
//        nim = scanner.nextInt();

        System.out.print("Masukan IPK anda : ");
        ipk.setIpk(scanner.nextDouble());

        System.out.print("Masukan Gaji orang Tua : ");
        gaji.setGaji(scanner.nextDouble());

        System.out.println();

        // Menghitung nilai Ipk
        hslBuruk = ipk.buruk(ipk.getIpk());
        hslCukup = ipk.cukup(ipk.getIpk());
        hslBagus = ipk.bagus(ipk.getIpk());

        // Memasukan data ipk kedalam mapIpk
        Map<String, Double> mapIpk = new HashMap<>();
        mapIpk.put("ipk buruk", hslBuruk);
        mapIpk.put("ipk cukup", hslCukup);
        mapIpk.put("ipk bagus", hslBagus);

        // Menghitung nilai gaji
        hslKecil = gaji.kecil(gaji.getGaji());
        hslSedang = gaji.sedang(gaji.getGaji());
        hslBesar = gaji.besar(gaji.getGaji());
        hslSangatBesar = gaji.sangatBesar(gaji.getGaji());

        // Memasukan data gaji kedalam mapGaji
        Map<String, Double> mapGaji = new HashMap<>();
        mapGaji.put("gaji kecil", hslKecil);
        mapGaji.put("gaji sedang", hslSedang);
        mapGaji.put("gaji besar", hslBesar);
        mapGaji.put("gaji sangat besar", hslSangatBesar);

        filterOutput();

        System.out.println();

        // Memasukan mapIpk dan mapGaji kedalam method filterNK yang ada di class NilaiKelayakan
        NilaiKelayakan nilaiKelayakan = new NilaiKelayakan();
        Map<String, Double> mapNK = nilaiKelayakan.filterNK(mapIpk, mapGaji);

        System.out.println("Size data nya adalah : " + mapNK.size());

        for (Map.Entry nk : mapNK.entrySet()) {
            System.out.println(nk.getKey() + "(" + nk.getValue() + ")");
        }

        System.out.println();

        // Memasukan data mapNK kedalam method filtering
        Map<String, Double> mapFF = nilaiKelayakan.finalFiltering(mapNK);

        System.out.println("Size data final adalah : " + mapFF.size());

        for (Map.Entry nkFF : mapFF.entrySet()) {
            System.out.println(nkFF.getKey() + " " + nkFF.getValue());
        }
    }

    public static void filterOutput() {
        if (hslBuruk != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari IPK buruk = " + hslBuruk);
        }

        if (hslCukup != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari IPK cukup = " + hslCukup);
        }

        if (hslBagus != 0.00) {
            System.out.println("Hasil nilai keanggotaan dari IPK bagus = " + hslBagus);
        }

        if (hslKecil != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari GAJI kecil = " + hslKecil);
        }

        if (hslSedang != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari GAJI sedang = " + hslSedang);
        }

        if (hslBesar != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari GAJI besar = " + hslBesar);
        }

        if (hslSangatBesar != 0.0) {
            System.out.println("Hasil nilai keanggotaan dari GAJI sangat besar = " + hslSangatBesar);
        }
    }
}
