package PRAK201_2410817320010_RabiahRiskaAmaliah;

public class Main {
    public static void main(String[] args) {
        fruit apple = new fruit();
        apple.setName("Apel");
        apple.setPrice(7000);
        apple.setWeight(0.4);
        apple.setTotalweight(40.0);

        fruit mango = new fruit();
        mango.setName("Mangga");
        mango.setPrice(3500);
        mango.setWeight(0.2);
        mango.setTotalweight(15.0);

        fruit avocado = new fruit();
        avocado.setName("Alpukat");
        avocado.setPrice(10000);
        avocado.setWeight(0.25);
        avocado.setTotalweight(12.0);

        apple.print();
        mango.print();
        avocado.print();
    }
}
