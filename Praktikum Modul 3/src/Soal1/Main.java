package Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> dicelist = new LinkedList<>();

        System.out.print(" ");
        int N = input.nextInt();

        int total = 0;

        for (int i = 0; i < N; i++) {
            Dice d = new Dice ();
            dicelist.add(d);
        }

        for (int i = 0; i < dicelist.size(); i++) {
            int value = dicelist.get(i).getValue();
            System.out.println("Dadu ke-" + (i+1) + " bernilai " + value);
            total += value;
        }

        System.out.println("Total nilai dadu keseluruhaan " + total);
    }
}
