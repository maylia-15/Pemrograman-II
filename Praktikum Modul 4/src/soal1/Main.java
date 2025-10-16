package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String name = input.nextLine();
        System.out.print("Ras: ");
        String breed = input.nextLine();

        pet Pet = new pet(name, breed);
        Pet.Display();
    }
}
