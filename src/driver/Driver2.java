import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah total data (N): ");
        int n = input.nextInt();

       
        int[] deretNilai = new int[n];
        System.out.println("Masukkan " + n + " deret nilai:");
        for (int i = 0; i < n; i++) {
            deretNilai[i] = input.nextInt();
        }

        // Ukuran kelompok berdasarkan pola gambar (2 siswa per kelompok)
        int ukuranKelompok = 2;

        System.out.print("Masukkan nomor kelompok: ");
        int kodeKelompok = input.nextInt();

        int totalNilai = 0;
        int indeksAwal = (kodeKelompok - 1) * ukuranKelompok;
        int indeksAkhir = indeksAwal + ukuranKelompok;

        if (indeksAwal >= 0 && indeksAwal < n) {
            for (int i = indeksAwal; i < indeksAkhir && i < n; i++) {
                totalNilai += deretNilai[i];
            }
            System.out.println("Total nilai kelompok " + kodeKelompok + " adalah: " + totalNilai);
        } else {
            System.out.println("Kelompok tidak ditemukan.");
        }

        input.close();
    }
}
