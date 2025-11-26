import java.util.Scanner;

public class InputHandler {
    private Scanner scan = new Scanner(System.in);

    public String nextLine(){
        return scan.nextLine();
    }

    public int nextInt(){
        int value = scan.nextInt();
        scan.nextLine();
        return value;
    }
}

