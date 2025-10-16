package soal2;

public class dog  extends cat{
    private String ability;

    public dog(String name, String breed, String FurColor, String ability){
        super(name,breed,FurColor);
        this.ability=ability;
    }

    @Override
    public void Display(){
        super.Display();
        System.out.println("Memiliki kemampuan : " + ability);
    }
}
