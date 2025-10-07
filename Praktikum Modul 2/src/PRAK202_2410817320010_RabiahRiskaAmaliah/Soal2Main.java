package PRAK202_2410817320010_RabiahRiskaAmaliah;

public class Soal2Main {
    public static void main(String[] args) {
        coffee coffee1 = new coffee();
        coffee1.name = "Espresso";
        coffee1.size = "Medium";
        coffee1.price = 25000;

        coffee1.print();
        coffee1.setBuyer("Alice");
        System.out.println("Coffee Buyer: " + coffee1.getBuyer());
        System.out.println("Coffee Tax: Rp. " + coffee1.getTax());
    }
}
