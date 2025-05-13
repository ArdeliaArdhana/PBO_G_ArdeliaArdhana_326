package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class  LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin", "314", "Admin314", "Password314");
        Mahasiswa mahasiswa = new Mahasiswa("Rizka Amelia Rusadi", "202410370110314");

        while (true) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            User user = null; // Variabel polymorphic

            if (pilihan == 1) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    admin.displayInfo();
                    user = admin; // Simpan admin dalam variabel User
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                    user = mahasiswa; // Simpan mahasiswa dalam variabel User
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            // Polymorphism: memanggil displayAppMenu() melalui variabel User
            if (user != null) {
                user.displayAppMenu();
            }
        }
    }
}