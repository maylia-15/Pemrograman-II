import java.util.Scanner;

public class PRAK102_2410817320010_RabiahRiskaAmaliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai: ");
        int number = input.nextInt();

        int i = 0;
        while (i < 10) {
            if (number % 5 == 0) {
                System.out.print((number / 5-1) + " ");
            }else {
                System.out.print(number + " ");
            }

            number++;
            i++;
        }
    }
}
