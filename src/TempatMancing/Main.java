
package TempatMancing;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ikan[] daftarIkan = {
            new Ikan("Lele", 20000, 50),
            new Ikan("Nila", 25000, 30),
            new Ikan("Gurame", 30000, 20)
        };

        System.out.println("=== Tempat Pemancingan Jaya ===");

        try {
            System.out.print("Masukkan nama pengunjung: ");
            String nama = input.nextLine();
            System.out.print("Masukkan ID pengunjung: ");
            String id = input.nextLine();
            System.out.print("Lama memancing (jam): ");
            int durasi = input.nextInt();

            Pengunjung pengunjung = new Pengunjung(nama, id, durasi);

            System.out.println("\nPilih jenis ikan yang dipancing:");
            for (int i = 0; i < daftarIkan.length; i++) {
                System.out.println((i + 1) + ". " + daftarIkan[i].getJenis() + " - Rp " + daftarIkan[i].getHargaPerKg() + "/kg");
            }

            System.out.print("Pilihan Anda (1-3): ");
            int pilihan = input.nextInt();

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Pilihan tidak valid.");
                return;
            }

            Ikan ikanDipilih = daftarIkan[pilihan - 1];

            System.out.print("Masukkan berat ikan (kg): ");
            double berat = input.nextDouble();

            Transaksi transaksi;

            if (berat > 10) {
                System.out.println("Anda mendapat diskon 10%!");
                transaksi = new TransaksiDiskon(pengunjung, ikanDipilih, berat);
            } else {
                transaksi = new Transaksi(pengunjung, ikanDipilih, berat);
            }

            transaksi.cetakNota();

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harus angka.");
        }

        input.close();
    }
}

