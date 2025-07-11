
package TempatMancing;


public class TransaksiDiskon extends Transaksi {
    public TransaksiDiskon(Pengunjung pengunjung, Ikan ikan, double berat) {
        super(pengunjung, ikan, berat);
    }

    @Override
    public double hitungBiaya() {
        double total = super.hitungBiaya();
        return total * 0.9; // diskon 10%
    }
}
