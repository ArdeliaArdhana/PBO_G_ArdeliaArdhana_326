// Subclass Musuh
class Musuh extends KarakterGame {

    // Constructor menggunakan super()
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15); // Mengurangi 15 poin kesehatan target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}