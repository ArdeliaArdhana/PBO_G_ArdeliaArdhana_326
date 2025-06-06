package com.praktikum.users;

public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

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

    // Abstract methods sesuai petunjuk
    public abstract boolean login(String input1, String input2);
    public abstract void displayAppMenu(); //method untuk menampilkan menu spesifik peran

    public void displayInfo() {
        System.out.println("User Info:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}