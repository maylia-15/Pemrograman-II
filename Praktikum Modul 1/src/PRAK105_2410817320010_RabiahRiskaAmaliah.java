import java.util.Scanner;

public class PRAK105_2410817320010_RabiahRiskaAmaliah {
    public static void main(String[] args) {
        final double PHI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Jari-Jari: ");
        double r = input.nextDouble();

        System.out.print("Input Tinggi: ");
        double h = input.nextDouble();

        if (r <= 0 || h <= 0) {
            System.out.println("Nilai harus positif");
        } else {
            double volume = PHI * r * r * h;
            System.out.println("Volume tabung dengan jari-jari " + r +
                    " cm dan tinggi " + h + " cm adalah " + volume + " m3");
        }
    }
}
