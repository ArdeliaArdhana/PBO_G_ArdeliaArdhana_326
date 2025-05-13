package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    // Overloading
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul \"" + judul + "\"");
    }

    public void pinjamBuku(String judul, int durasiHari) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasiHari + " hari");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " telah mengembalikan buku \"" + judul + "\"");
    }

    public void displayInfo() {
        System.out.println("Anggota: " + nama + " | ID: " + idAnggota);
    }
}