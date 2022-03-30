//khalid surya gusti (2015061045)
package com.company;

// Mahasiswa
class Mahasiswa {

    String nama;
    String NPM;
    String prodi;
    int usia;
    String alamat;
    Buku buku;
    Lokasi lokasi;
    //Method
    void cariBuku(Buku Buku) {
        this.buku = Buku;
    }
    //Method
    void cariRak(Lokasi Lokasi) {
        this.lokasi =  Lokasi;
    }
    //constructor
    Mahasiswa(String nama, String NPM, String Prodi, int Usia, String Alamat) {
        this.nama = nama;
        this.NPM = NPM;
        this.prodi = Prodi;
        this.usia = Usia;
        this.alamat = Alamat;
    }
    //method
    void detailMahasiswa() {
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN UNILA \n");
        System.out.println("\n=========== DATA MAHASISWA ===========");
        System.out.println("Nama     : " + nama);
        System.out.println("NPM      : " + NPM);
        System.out.println("Prodi    : "+ prodi);
        System.out.println("Usia     : "+ usia);
        System.out.println("Alamat   : "+ alamat);
        System.out.println("====================================== \n");
        buku.detailBuku();
        lokasi.detailLokasi();
    }
}

// Buku
class Buku{
    String judulBuku;
    String IDBuku;
    String jenisBuku;
    String pengarang;
    String penerbit;
    int jumlahBuku;
    //constructor
    Buku(String judulBuku, String IDBuku, String jenisBuku, String namaPengarang, String penerbit, int jumlahBuku){
        this.judulBuku = judulBuku;
        this.IDBuku = IDBuku;
        this.jenisBuku = jenisBuku;
        this.pengarang = namaPengarang;
        this.penerbit = penerbit;
        this.jumlahBuku = jumlahBuku;
    }
    //method
    void detailBuku(){
        System.out.println("\n=========== DETAIL BUKU ==============");
        System.out.println("Judul Buku                : " + judulBuku);
        System.out.println("ID buku                   : " + IDBuku);
        System.out.println("Jenis Buku                : " + jenisBuku);
        System.out.println("Pengarang Buku            : " + pengarang);
        System.out.println("Penerbit Buku             : " + penerbit);
        System.out.println("Jumlah Buku yang Tersedia : " + jumlahBuku);
        System.out.println("====================================== \n");
    }
}

// Lokasi Buku
class Lokasi{
    String lokasiRak;
    int nomorRak;
    int barisRak;
    //constructor
    Lokasi(String Lokasi, int Nomor, int BarisRak){
        this.lokasiRak = Lokasi;
        this.nomorRak = Nomor;
        this.barisRak = BarisRak;
    }
    //Method
    void    detailLokasi (){
        System.out.println("\n=========== LOKASI BUKU ==============");
        System.out.println("Lokasi Rak Buku           : " + lokasiRak);
        System.out.println("Nomor Rak                 : " + nomorRak);
        System.out.println("Baris Rak                 : " + barisRak);
    }
}

public class Main {
    public static void main(String[] args) {
        //Instansiasi Objek
        Mahasiswa mhs1 = new Mahasiswa("Khalid surya", "2015061045","Teknik Informatika", 20, "Jl.sudirman");
        Buku cari = new Buku("Pbo 20", "12112", "Informatika", "Sumanto", "TCmedia", 10);
        Lokasi buku = new Lokasi("Gedung 1, lantai 3", 112, 7);

        //Pemanggilan Method
        mhs1.cariBuku(cari);
        mhs1.cariRak(buku);
        mhs1.detailMahasiswa();
    }
}