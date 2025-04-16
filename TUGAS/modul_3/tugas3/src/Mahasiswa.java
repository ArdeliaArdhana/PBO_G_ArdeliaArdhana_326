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
