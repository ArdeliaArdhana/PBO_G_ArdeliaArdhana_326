package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat buku
        Buku buku1 = new Fiksi("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new NonFiksi("Sejarah Indonesia", "Slamet Muljana");

        // Menampilkan info buku
        buku1.displayInfo();  // Polymorphism
        buku2.displayInfo();

        // Membuat anggota
        Anggota anggota1 = new Anggota("Ardelia", "326");
        Anggota anggota2 = new Anggota("Amelia", "314");

        anggota1.displayInfo();
        anggota1.pinjamBuku("Laskar Pelangi");
        anggota1.pinjamBuku("Sejarah Indonesia", 7);
        anggota1.kembalikanBuku("Laskar Pelangi");

        System.out.println();

        anggota2.displayInfo();
        anggota2.pinjamBuku("Sejarah Indonesia");
        anggota2.kembalikanBuku("Sejarah Indonesia");
    }
}