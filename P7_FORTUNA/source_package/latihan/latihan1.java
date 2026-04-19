package P7_FORTUNA.source_package.latihan;

import java.util.Scanner;

public class latihan1 {
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

        if (jurusan.equals("TI") || jurusan .equals("SI")) {
            System.out.println("\n=== JADWAL SHIFT KULIAH ===");
            System.out.println("1. Reg A (Pagi)");
            System.out.println("2. Reg B (Malam)");
            System.out.println("3. Reg Ck (Class Kamis)");
            System.out.println("4. Reg CS (Class Sabtu)");
            System.out.print("Pilih Shift: ") ; 
            
            int pilihan = input.nextInt();

            System.out.print("\nShift yang dipilih: ");

            switch (pilihan) {
                case 1:
                    System.out.println("Reg A (Kelas Pagi Pukul 07.00-17.00 WIB)");
                    break;
                
                case 2:
                    System.out.println("Reg B (Kelas Malam Pukul 18.00-21.00 WIB)");
                    break;

                case 3:
                    System.out.println("Reg CK (Kelas Kamis Pukul 07.00-17.00 WIB)");
                    break;

                case 4:
                    System.out.print("Reg CS (Kelas Sabtu Pukul 07.00-17.00 WIB)");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } else {
            System.out.println("\nJURUSAN TIDAK ADA.");
        }
        input.close();
    }
    }