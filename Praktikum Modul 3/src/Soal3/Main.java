package Soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do{
            System.out.println("Menu: ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkam NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Masukan Nama Mahasiswa: ");
                String name = input.nextLine();
                System.out.print("Masukan NIM Mahasiswa (harus unik): ");
                String id = input.nextLine();
                students.add(new Student(name, id));
                System.out.println("Mahasiswa " + name + " ditambahkan.");

            } else if (choice == 2) {
                System.out.print("Masukan NIM Mahasiswa yang akan dihapus: ");
                String id = input.nextLine();
                boolean removed = false;

                for (Student s : students) {
                    if (s.getId().equals(id)){
                        students.remove(s);
                        removed = true;
                        System.out.println("Mahasiswa dengan NIM " + id + " dihapus.");
                        break;
                    }
                }
                if (!removed) System.out.println("Mahasiswa " + id + " tidak ditemukan.");

            } else if (choice == 3) {
                System.out.println("Masukan NIM untuk mencari data: ");
                String id = input.nextLine();
                boolean found = false;

                for (Student s : students) {
                    if (s.getId().equals(id)){
                        System.out.println("Mencari Mahasiswa " + s.getName() + " (NIM: " + s.getId() + ")");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Mahasiswa tidak ditemukan.");

            }else if (choice == 4) {
                if (students.isEmpty()) {
                    System.out.println("Tidak ada data Mahasiswa");
                } else {
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Student s : students) {
                        System.out.println("NIM: " + s.getId() + ", Nama: " + s.getName() );
                    }
                }

            } else if (choice == 0) {
                System.out.println("Terima kasih!");
                students.clear();
            } else {
                System.out.println("Invalid");
            }
        } while (choice != 0);
    }
}
