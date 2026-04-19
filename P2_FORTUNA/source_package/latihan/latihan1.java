package P2_FORTUNA.source_package.latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] nim = new String[100];
        String[] nama = new String[100];
        String[] programStudi = new String[100];
        String[] fakultas = new String[100];
        String[] kelas = new String[100];

        int jumlahData = 0; 
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== Tambah Data Mahasiswa ===");

                    // Validasi NIM (wajib angka)
                    boolean nimValid = false;
                    while (!nimValid) {
                        System.out.print("Input NIM     : ");
                        nim[jumlahData] = input.nextLine();
                        if (nim[jumlahData].matches("\\d+")) {
                            nimValid = true;
                        } else {
                            System.out.println("NIM harus angka! Silakan input ulang.");
                        }
                    }

                    // Validasi Nama (wajib huruf)
                    boolean namaValid = false;
                    while (!namaValid) {
                        System.out.print("Input Nama    : ");
                        nama[jumlahData] = input.nextLine();
                        if (nama[jumlahData].matches("[a-zA-Z ]+")) {
                            namaValid = true;
                        } else {
                            System.out.println("Nama harus huruf! Silakan input ulang.");
                        }
                    }

                    System.out.print("Input Kelas    : ");
                    kelas[jumlahData] = input.nextLine();

                    System.out.print("Input Program Studi : ");
                    programStudi[jumlahData] = input.nextLine();

                    System.out.print("Input Fakultas : ");
                    fakultas[jumlahData] = input.nextLine();

                    jumlahData++;
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n=== Data Mahasiswa ===");

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println("\nData ke-" + (i + 1));
                        System.out.println("NIM     : " + nim[i]);
                        System.out.println("Nama    : " + nama[i]);
                        System.out.println("Kelas   : " + kelas[i]);
                        System.out.println("Program Studi : " + programStudi[i]);
                        System.out.println("Fakultas : " + fakultas[i]);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor data yang ingin diedit: ");
                    int edit = input.nextInt() - 1;
                    input.nextLine();

                    if (edit < jumlahData) {

                        // Validasi Nama (wajib huruf)
                        boolean namaValidEdit = false;
                        while (!namaValidEdit) {
                            System.out.print("Nama baru    : ");
                            nama[edit] = input.nextLine(); 
                            if (nama[edit].matches("[a-zA-Z ]+")) {
                                namaValidEdit = true;
                            } else {
                                System.out.println("Nama harus huruf! Silakan input ulang.");
                            }
                        }

                        System.out.print("Kelas baru    : ");
                        kelas[edit] = input.nextLine();

                        System.out.print("Program Studi baru : ");
                        programStudi[edit] = input.nextLine();

                        System.out.print("Fakultas baru : ");
                        fakultas[edit] = input.nextLine(); 

                        System.out.println("Data berhasil diubah.");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int hapus = input.nextInt() - 1;

                    if (hapus < jumlahData) {

                        for (int i = hapus; i < jumlahData - 1; i++) {
                            nim[i] = nim[i + 1];
                            nama[i] = nama[i + 1];
                            kelas[i] = kelas[i + 1];
                            programStudi[i] = programStudi[i + 1];
                            fakultas[i] = fakultas[i + 1];
                        }

                        jumlahData--;
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                        System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }
}