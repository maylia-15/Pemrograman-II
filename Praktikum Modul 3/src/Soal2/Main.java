package Soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> months  = new HashMap<>(Map.ofEntries(
                Map.entry(1, "Januari"),
                Map.entry(2, "Februari"),
                Map.entry(3, "Maret"),
                Map.entry(4, "April"),
                Map.entry(5, "Mei"),
                Map.entry(6, "Juni"),
                Map.entry(7, "Juli"),
                Map.entry(8, "Agustus"),
                Map.entry(9, "September"),
                Map.entry(10, "Oktober"),
                Map.entry(11, "November"),
                Map.entry(12, "Desember")
        ));

        LinkedList<Country> list = new LinkedList<>();

        int n = input.nextInt(); input.nextLine();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String government = input.nextLine();
            String leader = input.nextLine();

            if (government.equalsIgnoreCase("Monarki")){
                list.add(new Country(name,government,leader));
            }else{
                int day = input.nextInt();
                int month = input.nextInt();
                int year = input.nextInt();
                if (input.hasNextLine()) input.nextLine();
                list.add(new Country(name,government,leader,day,month,year));
            }
        }

        for (Country country : list) {
            String title = switch (country.getGovernment().toLowerCase()){
                case "presiden" -> "Presiden";
                case "perdana menteri" -> "Perdana Menteri";
                case "monarki" -> "Raja";
                default -> country.getGovernment();
            };

            System.out.println("Negara " + country.getName() + " mempunyai " + title + " Bernama " + country.getLeader());
            if (!country.getGovernment().equalsIgnoreCase("monarki")){
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + country.getDay() + " " + months.get(country.getMonth()) + " " + country.getYear());
            }
            System.out.println();
        }
    }
}
