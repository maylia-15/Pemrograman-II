import java.util.Scanner;

public class PRAK103_2410817320010_RabiahRiskaAmaliah {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukan Nilai N: ");
        int N = Input.nextInt();

        System.out.print("Masukan Bilangan Awal: ");
        int Number = Input.nextInt();

        int i = 0;
        do  {
            if (Number%2!=0) {
                System.out.print(Number+" ");
                i++;
            }
            Number++;
        } while (i<N);
    }
}
