// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        // Membuat objek hewan2
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Menampilkan informasi kedua hewan
        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkanInfo();

        System.out.println("Informasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}