public class DefaultPaymentProcessor  implements PaymentProcessor{
    private Payment payment;
    public DefaultPaymentProcessor(Payment payment){
        this.payment = payment;
    }
    @Override
    public void process(double amount) {

    }
}
