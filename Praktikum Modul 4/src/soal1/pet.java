package soal1;

public class pet {
    private String name;
    private String breed;

    public pet(String name, String breed){
         this.name = name;
         this.breed= breed;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public void Display(){
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getBreed());
    }
}
