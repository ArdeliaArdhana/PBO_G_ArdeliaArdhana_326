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
