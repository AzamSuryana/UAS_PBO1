
package TempatMancing;



public class Pengunjung {
    private String nama;
    private String id;
    private int durasi;

    public Pengunjung(String nama, String id, int durasi) {
        this.nama = nama;
        this.id = id;
        this.durasi = durasi;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public int getDurasi() {
        return durasi;
    }
}
