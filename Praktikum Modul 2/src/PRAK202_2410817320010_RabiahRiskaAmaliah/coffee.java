package PRAK202_2410817320010_RabiahRiskaAmaliah;

public class coffee{
    public String name,size, buyer;
    public double price;

    public void setBuyer(String buyer){
        this.buyer = buyer;
    }

    public String getBuyer(){
        return buyer;
    }

    public double getTax(){
        return price * 0.11;
    }

    public void print(){
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga:Rp. " + price);
    }
}
