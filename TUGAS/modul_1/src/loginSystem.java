import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                // Login Admin
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (username.equals("Admin326") && password.equals("Password326")) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break; // Keluar dari loop setelah login
            } else if (pilihan == 2) {
                // Login Mahasiswa
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (nama.equals("Ardelia Ardhana Bahri") && nim.equals("202410370110326")) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break; // Keluar dari loop setelah login
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}