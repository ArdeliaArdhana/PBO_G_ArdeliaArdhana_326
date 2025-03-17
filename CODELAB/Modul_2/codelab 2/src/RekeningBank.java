public class RekeningBank {
    // Atribut
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println(); // Untuk memberikan jarak antar informasi
    }

    // Metode untuk setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor Uang: " + jumlah);
        System.out.println("Saldo setelah setor: " + saldo);
        System.out.println(); // Untuk memberikan jarak antar informasi
    }

    // Metode untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik Uang: " + jumlah);
            System.out.println("Saldo setelah tarik: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk menarik uang sebesar: " + jumlah);
        }
        System.out.println(); // Untuk memberikan jarak antar informasi
    }
}