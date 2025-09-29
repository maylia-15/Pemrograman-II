import java.util.Scanner;

public class PRAK101_2410817320010_RabiahRiskaAmaliah {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukan Nama Lengkap: ");
        String name = Input.nextLine();

        System.out.print("Masukan Tempat Lahir: ");
        String birthplace = Input.nextLine();

        System.out.print("Masukan Tanggal Lahir: ");
        int birthdate = Input .nextInt();

        System.out.print("Masukan Bulan Lahir: ");
        int birthmonth = Input.nextInt();

        String month = switch (birthmonth){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Tidak Tersedia";
        };

        System.out.print("Masukan Tahun Lahir: ");
        int year = Input.nextInt();

        System.out.print("Masukan Tinggi Badan: ");
        int height = Input.nextInt();

        System.out.print("Masukan Berat Badan: ");
        double weight = Input.nextDouble();

        System.out.println(" ");
        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthplace + " pada Tanggal " + birthdate + " " + month + " " +year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " +weight + " kilogram");
    }
}
