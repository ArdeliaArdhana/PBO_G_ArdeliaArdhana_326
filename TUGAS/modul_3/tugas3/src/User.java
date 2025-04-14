import java.util.Scanner;

// Superclass User
class User {
    private String nama;
    private String nim;

    // Constructor untuk menginisialisasi nama dan nim
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter untuk atribut nama dan nim
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method login (akan di-override oleh subclass)
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    // Method displayInfo (akan di-override oleh subclass)
    public void displayInfo() {
        System.out.println("User Info:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Subclass Admin
class Admin extends User {
    private String username;
    private String password;

    // Constructor Admin menggunakan super untuk menginisialisasi nama dan nim
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim); // Memanggil constructor superclass
        this.username = username;
        this.password = password;
    }

    // Overriding method login untuk memeriksa username dan password
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    // Overriding method displayInfo untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Username: " + username);
    }
}

// Subclass Mahasiswa
class Mahasiswa extends User {

    // Constructor Mahasiswa menggunakan super untuk menginisialisasi nama dan nim
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // Memanggil constructor superclass
    }

    // Overriding method login untuk mencocokkan input nama dan nim
    @Override
    public boolean login(String inputNama, String inputNim) {
        return super.login(inputNama, inputNim); // Memanggil method login dari superclass
    }

    // Overriding method displayInfo untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

// Kelas utama LoginSystem (program utama)
class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa dengan data yang sudah diketahui
        Admin admin = new Admin("Admin", "000", "Admin326", "Password326");
        Mahasiswa mahasiswa = new Mahasiswa("Ardelia Ardhana Bahri", "202410370110326");

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
                    admin.displayInfo();
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break; // Keluar dari loop setelah login berhasil/gagal

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
                break; // Keluar dari loop setelah login berhasil/gagal

            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}

