import javax.lang.model.element.Name;

public class AddStudent {
    private Payment paymentCalculator;

    public AddStudent(Payment paymentCalculator){
        this.paymentCalculator = paymentCalculator;
    }

    public Student create(String name, int id, int totalSKS){
    double ukt = paymentCalculator.pay(totalSKS);
    return new RegularStudent(name, id, totalSKS, ukt);
    }
}
