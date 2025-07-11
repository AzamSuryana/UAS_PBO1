
package TempatMancing;


    public class Ikan {
    private String jenis;
    private double hargaPerKg;
    private int stok;

    public Ikan(String jenis, double hargaPerKg, int stok) {
        this.jenis = jenis;
        this.hargaPerKg = hargaPerKg;
        this.stok = stok;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}


