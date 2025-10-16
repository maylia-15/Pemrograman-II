package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();
        System.out.print("Ras: ");
        String breed = input.nextLine();
        System.out.print("Warna Bulu: ");
        String FurColor = input.nextLine();

        if (choice == 1) {
            cat Cat = new cat(name, breed, FurColor);
            Cat.Display();
        } else if (choice == 2) {
            System.out.print("Kemampuan: ");
            String ability = input.nextLine();
            dog Dog = new dog (name, breed, FurColor, ability);
            Dog.Display();
        } else {
            System.out.print("Pilihan Invalid! ");
        }
    }
}
