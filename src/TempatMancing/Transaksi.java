
package TempatMancing;


public class Transaksi {
    protected Pengunjung pengunjung;
    protected Ikan ikan;
    protected double berat;

    public Transaksi(Pengunjung pengunjung, Ikan ikan, double berat) {
        this.pengunjung = pengunjung;
        this.ikan = ikan;
        this.berat = berat;
    }

    public double hitungBiaya() {
        return berat * ikan.getHargaPerKg();
    }

    public void cetakNota() {
        System.out.println("\n--- Nota Transaksi ---");
        System.out.println("Nama: " + pengunjung.getNama());
        System.out.println("Jenis Ikan: " + ikan.getJenis());
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Total Bayar: Rp " + hitungBiaya());
    }
}


