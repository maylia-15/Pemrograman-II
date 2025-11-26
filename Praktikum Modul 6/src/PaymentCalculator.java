public class PaymentCalculator implements Payment{
    @Override
    public double pay(int totalSKS){
        return totalSKS * 250000;
    }
}
