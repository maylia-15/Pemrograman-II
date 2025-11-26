public class RegularStudent extends Student {
    private int totalSKS;
    private double totalUKT;

    public RegularStudent(String name, int id, int totalSKS, double totalUKT) {
        super(name, id);
        this.totalSKS = totalSKS;
        this.totalUKT = totalUKT;
    }

    @Override
    public void showInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("NIM: " + getId());
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Total UKT: Rp" + totalUKT);
    }
}
