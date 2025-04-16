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







