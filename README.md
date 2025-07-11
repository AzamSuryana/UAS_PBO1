# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini, Ikan, Transaksi, dan TransaksiDiskon adalah contoh dari class.

bash
public class Ikan {
    ...
}

public class TransaksiDiskon extends Transaksi {
    ...
}

public class Transaksi {
    ...
}


2. *Object* adalah instance dari class. Pada kode ini, Pengunjung pengunjung = new Pengunjung(nama, id, durasi); adalah contoh pembuatan object.

bash
Pengunjung pengunjung = new Pengunjung(nama, id, durasi);


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, nama dan id adalah contoh atribut.

bash
String nama;
String id;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Pengunjung dan TransaksiDiskon.

bash
public Pengunjung(String nama, String id, int durasi) {
    this.nama = nama;
    this.id = id;
    this.durasi = durasi;
}

public TransaksiDiskon(Pengunjung pengunjung, Ikan ikan, double berat) {
        super(pengunjung, ikan, berat);
    }

5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setStok adalah contoh method mutator.

bash
public void setStok(int stok) {
        this.stok = stok;
}

6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getJenis, getStok adalah contoh method accessor.

bash
public String getJenis() {
    return jenis;
}

public String getStok() {
    return stok;
}


7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama dan npm dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
    private String jenis;
    private double hargaPerKg;
    private int stok;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, TransaksiDiskon mewarisi Transaksi dengan sintaks extends.

bash
public class TransaksiDiskon extends Transaksi {
    ...
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method hitungBiaya() di Transaki merupakan overloading method hitungBayar dan hitungBayar di TransaksiDiskon merupakan override dari method hitungBiaya di Transaksi.

bash
public double hitungBiaya() {
        return berat * ikan.getHargaPerKg();
}

@Override
public double hitungBiaya() {
    ...
}


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getTransaksi .

bash
if (berat > 10) {
                System.out.println("Anda mendapat diskon 10%!");
                transaksi = new TransaksiDiskon(pengunjung, ikanDipilih, berat);
            } else {
                transaksi = new Transaksi(pengunjung, ikanDipilih, berat);
            }


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < daftarIkan.length; i++) {
    ...
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

bash
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

13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, adalah contoh penggunaan array.

bash
Ikan[] daftarIkan = {
            new Ikan("Lele", 20000, 50),
            new Ikan("Nila", 25000, 30),
            new Ikan("Gurame", 30000, 20)
        };

14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

bash
try {
    // code that might throw an exception
} catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harus angka.");
        }


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Muhammad Bagus Dian Suryana 
NPM: 2310010161
