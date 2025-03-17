public class Main {
    public static void main(String[] args) {
        // Membuat objek RekeningBank dengan saldo yang ditentukan
        RekeningBank rekening1 = new RekeningBank("202410370110326", "Ardelia", 50000.0); // Ganti dengan NIM dan Nama kalian
        RekeningBank rekening2 = new RekeningBank("202410370110314", "Amelia", 20000.0); // Ganti dengan NIM dan Nama teman kalian

        // Menampilkan informasi rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan setor uang pada rekening1
        rekening1.setorUang(500.0);

        // Melakukan tarik uang pada rekening1
        rekening1.tarikUang(300.0);

        // Mencoba tarik uang lebih dari saldo pada rekening1
        rekening1.tarikUang(2000.0);

        // Melakukan setor uang pada rekening2
        rekening2.setorUang(1000.0);

        // Melakukan tarik uang pada rekening2
        rekening2.tarikUang(500.0);
    }
}