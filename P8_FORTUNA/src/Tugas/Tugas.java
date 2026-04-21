package Tugas;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        int pilihan;
        int jumlah = 0;
        String[] kehadiran = new String[100];

        do{ 
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input jumlah mahasiswa");
            System.out.println("2. Input kehadiran");
            System.out.println("3. Tampilkan hasil");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Jumlah mahasiswa (max 100): ");
                    jumlah = input.nextInt();

                    if (jumlah > 100) {
                        System.out.println("Maksimal 100! Di-set ke 100.");
                        jumlah = 100;
                    } else if (jumlah <= 0) {
                        System.out.println("Jumlah harus lebih dari 0!");
                        jumlah = 0;
                    }
                    break;

                case 2:
                    if (jumlah == 0) {
                        System.out.println("Input jumlah mahasiswa dulu!");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            String status;

                            do {
                                System.out.print("Mahasiswa ke-" + (i + 1) + " (H/T): ");
                                status = input.next();
                            } while (!status.equalsIgnoreCase("H") && !status.equalsIgnoreCase("T"));

                            kehadiran[i] = status;
                        }
                    }
                    break;

                case 3:
                    if (jumlah == 0) {
                        System.out.println("Belum ada data!");
                    } else {
                        int hadir = 0;

                        System.out.println("\n=== DATA KEHADIRAN ===");

                        for (int i = 0; i < jumlah; i++) {
                            if (kehadiran[i] == null) {
                                System.out.println("Mahasiswa ke-" + (i + 1) + ": Belum diinput");
                            } else {
                                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + kehadiran[i]);

                                if (kehadiran[i].equalsIgnoreCase("H")) {
                                    hadir++;
                                }
                            }
                        }

                        double persentase = (hadir * 100.0) / jumlah;

                        System.out.println("\nTotal hadir     : " + hadir);
                        System.out.printf("Persentase      : %.2f%%\n", persentase);

                        if (persentase >= 75) {
                            System.out.println("Status          : LULUS");
                        } else {
                            System.out.println("Status          : TIDAK LULUS");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close(); 
    }
}
