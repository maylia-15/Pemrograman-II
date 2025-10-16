package soal2;

import java.util.Scanner;

public class pet {
    private String name;
    private String breed;

    public pet(String name, String breed) {
        this.name = name;
        this.breed =breed;
    }

    public void Display (){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan Ras : " + breed);
    }
}
