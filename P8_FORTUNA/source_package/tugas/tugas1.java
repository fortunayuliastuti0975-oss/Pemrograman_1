package P8_FORTUNA.source_package.tugas;

import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int jumlah = 0;
        String[] kehadiran = new String[100];

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input jumlah mahasiswa");
            System.out.println("2. Input kehadiran");
            System.out.println("3. Tampilkan hasil");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah mahasiswa: ");
                    jumlah = input.nextInt();
                    break;

                case 2:
                    if (jumlah == 0) {
                        System.out.println("Isi jumlah dulu!");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.print("Mahasiswa ke-" + (i+1) + " (H/T): ");
                            kehadiran[i] = input.next();
                        }
                    }
                    break;

                case 3:
                    if (jumlah == 0) {
                        System.out.println("Belum ada data!");
                    } else {
                        int hadir = 0;

                        System.out.println("\n=== DATA ===");
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("Mhs " + (i+1) + ": " + kehadiran[i]);
                            if (kehadiran[i].equalsIgnoreCase("H")) {
                                hadir++;
                            }
                        }

                        double persentase = (hadir * 100.0) / jumlah;

                        System.out.println("Total hadir: " + hadir);
                        System.out.println("Persentase: " + persentase + "%");

                        if (persentase >= 75) {
                            System.out.println("Status: LULUS");
                        } else {
                            System.out.println("Status: TIDAK LULUS");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Selesai.");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilihan != 4);

        input.close();
    }
}