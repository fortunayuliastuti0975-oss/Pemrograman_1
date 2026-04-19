package P7_FORTUNA.source_package.tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("---- Fakultas Ilmu Komputer ----");
        System.out.println("1. | Prodi Teknik Informatika (TI)");
        System.out.println("2. | Prodi Sistem Informasi (SI)");
        System.out.println("===================================");

        System.out.print("\nMasukan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukan Jurusan (TI/SI): ");
        String jurusan = input.nextLine().toUpperCase().trim();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama Mahasiswa: " + nama);

        if (jurusan.equals("TI") || jurusan.equals("SI")) {

            System.out.println("\n=== JADWAL SHIFT KULIAH ===");
            System.out.println("1. Reg A (Pagi)");
            System.out.println("2. Reg B (Malam)");
            System.out.println("3. Reg CK (Class Kamis)");
            System.out.println("4. Reg CS (Class Sabtu)");
            System.out.print("Pilih Shift: ");

            int pilihan = input.nextInt();

            System.out.print("\nShift yang dipilih: ");

            if (pilihan == 1) {
                System.out.println("Reg A (Kelas Pagi Pukul 07.00-17.00 WIB)");
            } else if (pilihan == 2) {
                System.out.println("Reg B (Kelas Malam Pukul 18.00-21.00 WIB)");
            } else if (pilihan == 3) {
                System.out.println("Reg CK (Kelas Kamis pukul 07.00-17.00 WIB)");
            } else if (pilihan == 4) {
                System.out.println("Reg CS (Kelas Sabtu Pukul 07.00-17.00 WIB)");
            } else {
                System.out.println("Pilihan Tidak Valid.");
            }

        } else {
            System.out.println("\nJURUSAN TIDAK ADA.");
        }

        input.close();
    }
}