package P4_FORTUNA.source_package.tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data 
        double makan = 20000;
        double transport = 10000;
        double belanja = 50000;

        // Hitung total
        double total = makan + transport + belanja;

        // Hitung persentase
        double persenMakan = (makan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja = (belanja / total) * 100;

        // Output
        System.out.println("=== DATA PENGELUARAN ===");
        System.out.println("Makan     : " + makan);
        System.out.println("Transport : " + transport);
        System.out.println("Belanja   : " + belanja);

        System.out.println("\nTotal = " + makan + " + " + transport + " + " + belanja + " = " + total);

        System.out.println("\n=== PERSENTASE ===");
        System.out.println("Makan     = " + persenMakan + "%");
        System.out.println("Transport = " + persenTransport + "%");
        System.out.println("Belanja   = " + persenBelanja + "%");
    }
    
}