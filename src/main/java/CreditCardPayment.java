public class CreditCardPayment implements Payment{


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card of $" + amount);

    }
}