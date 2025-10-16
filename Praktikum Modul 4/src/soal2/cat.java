package soal2;

public class cat extends pet{
    private String FurColor;

    public cat(String name, String breed, String FurColor){
        super(name, breed);
        this.FurColor = FurColor;
    }

    @Override
    public void Display(){
        super.Display();
        System.out.println("Memiliki warma bulu : " + FurColor);
    }
}
