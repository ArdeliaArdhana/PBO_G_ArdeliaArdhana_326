import java.util.Scanner;

// Kelas Utama LoginSystem
class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        while (true) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            if (pilihan == 1) {
                // Login Admin
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
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

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
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