package PRAK201_2410817320010_RabiahRiskaAmaliah;

public class fruit {
    private String name;
    private double price, weight, totalweight;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTotalweight(double totalweight) {
        this.totalweight = totalweight;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public double getWeight(){
        return weight;
    }

    public double getTotalweight(){
        return totalweight;
    }

    public double getBeforeDiscount() {
        return (totalweight/weight)*price;
    }

    public double getDiscount() {
        double total = getBeforeDiscount();
        double discount = (int) (totalweight/4)* (4*price) * 0.02;
        return discount;
    }

    public double getAfterDiscount() {
        return getBeforeDiscount () - getDiscount();
    }

    public void print() {
        System.out.println("Nama Buah: " + getName());
        System.out.println("Berat: " + getWeight());
        System.out.println("Harga: " + getPrice());
        System.out.println("Jumlah Beli: " + getTotalweight() + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getAfterDiscount());
    }
}
