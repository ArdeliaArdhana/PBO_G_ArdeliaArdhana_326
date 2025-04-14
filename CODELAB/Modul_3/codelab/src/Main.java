// Kelas Main untuk simulasi pertarungan
class Main {
    public static void main(String[] args) {
        // Membuat objek sesuai instruksi
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("wonder woman", 150);
        Musuh musuh = new Musuh("cheetah", 200);

        // Menampilkan status awal kesehatan
        System.out.println("Status awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());

        // Simulasi pertarungan
        pahlawan.serang(musuh); // Brimstone menyerang Viper menggunakan pedang
        musuh.serang(pahlawan); // Viper menyerang Brimstone menggunakan sihir
    }
}
