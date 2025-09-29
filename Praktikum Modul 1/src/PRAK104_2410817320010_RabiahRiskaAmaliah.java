import java.util.Scanner;

public class PRAK104_2410817320010_RabiahRiskaAmaliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] abu = new String[3];
        String[] bagas = new String[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) abu[i] = input.next();

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) bagas[i] = input.next();

        int scoreAbu = 0, scoreBagas = 0;
        for(int i=0; i<3; i ++){
            if (abu[i].equals(bagas[i])) {
            } else if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                    (abu[i].equals("G") && bagas[i].equals("K")) ||
                    (abu[i].equals("K") && bagas[i].equals("B"))) {
                scoreAbu++;
            } else {
                scoreBagas++;
            }
        }
        if (scoreAbu > scoreBagas) {
            System.out.println("Result: Abu wins");
        } else if (scoreBagas > scoreAbu) {
            System.out.println("Result: Bagas wins");
        } else {
            System.out.println("Result: Draw");
        }
    }
}
