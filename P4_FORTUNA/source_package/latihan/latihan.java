package P4_FORTUNA.source_package.latihan;
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukkan realisasi: ");
        int realisasi = input.nextInt();

        System.out.print("Masukkan jumlah kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        // Perhitungan
        int tidakHadir = realisasi - kehadiran;
        
        // Nilai kehadiran skala 0-100
        double nilaiKehadiran = (kehadiran / (double) realisasi) * 100;
        
        // Bobot kehadiran (10% dari nilai kehadiran)
        double bobotKehadiran = (nilaiKehadiran * 10) / 100;
        
        // Jika tidak hadir lebih dari 5, kurangi nilai
        double penguranganNilai = tidakHadir > 5 ? (tidakHadir - 5) * 5 : 0;
        double tugasAkhir = Math.max(0, tugas - penguranganNilai);
        double utsAkhir = Math.max(0, uts - penguranganNilai);
        double uasAkhir = Math.max(0, uas - penguranganNilai);
        
        double bobotTugas = (tugasAkhir * 20) / 100;
        double bobotUTS = (utsAkhir * 30) / 100;
        double bobotUAS = (uasAkhir * 40) / 100;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

        // Tentukan status lulus/tidak
        String status;
        if (tidakHadir > 5) {
            status = "TIDAK LULUS (Kehadiran tidak memenuhi syarat)";
        } else {
            status = (total >= 60) ? "LULUS" : "TIDAK LULUS";
        }

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Realisasi\t: " + realisasi);
        System.out.println("Kehadiran\t: " + kehadiran);
        System.out.println("Nilai Kehadiran\t: " + nilaiKehadiran);
        System.out.println("Nilai Tugas\t: " + tugas);
        System.out.println("Nilai UTS\t: " + uts);
        System.out.println("Nilai UAS\t: " + uas);
        System.out.println("\n--- Detail Perhitungan ---");
        System.out.println("Tidak Hadir: " + tidakHadir);
        if (tidakHadir > 5) {
            System.out.println("Pengurangan Nilai: " + penguranganNilai + " per komponen");
            System.out.println("Nilai Tugas Setelah Pengurangan: " + tugasAkhir);
            System.out.println("Nilai UTS Setelah Pengurangan: " + utsAkhir);
            System.out.println("Nilai UAS Setelah Pengurangan: " + uasAkhir);
        }
        System.out.println("Bobot Kehadiran: " + bobotKehadiran);
        System.out.println("Bobot Nilai Tugas: " + bobotTugas);
        System.out.println("Bobot Nilai UTS: " + bobotUTS);
        System.out.println("Bobot Nilai UAS: " + bobotUAS);
        System.out.println("Total Nilai: " + total);
        System.out.println("Status: " + status);



        input.close();
    }
}
