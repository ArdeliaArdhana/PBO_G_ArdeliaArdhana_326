import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Meminta input tahun lahir
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" :
                (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Tidak valid";

        // Menampilkan hasil
        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup scanner setelah selesai
        scanner.close();
    }
}