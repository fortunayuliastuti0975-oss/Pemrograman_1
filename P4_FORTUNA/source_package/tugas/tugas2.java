package P4_FORTUNA.source_package.tugas;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan durasi waktu belajar (jam): ");
        double belajar = input.nextDouble();

        System.out.print("Masukkan durasi waktu tidur (jam): ");
        double tidur = input.nextDouble();

        System.out.print("Masukkan durasi waktu bermain (jam): ");
        double bermain = input.nextDouble();

        // Hitung total waktu
        double total = belajar + tidur + bermain;

        // Hitung persentase
        double persenBelajar = (belajar / total) * 100;
        double persenTidur = (tidur / total) * 100;
        double persenBermain = (bermain / total) * 100;

        // Output
        System.out.println("\n=== DATA WAKTU HARIAN ===");
        System.out.println("Belajar  : " + belajar + " jam");
        System.out.println("Tidur    : " + tidur + " jam");
        System.out.println("Bermain  : " + bermain + " jam");

        System.out.println("\nTotal = " + belajar + " + " + tidur + " + " + bermain + " = " + total + " jam");

        System.out.println("\n=== PERSENTASE ===");
        System.out.println("Belajar  = " + persenBelajar + "%");
        System.out.println("Tidur    = " + persenTidur + "%");
        System.out.println("Bermain  = " + persenBermain + "%");
    }
}