public class PaymentSystemDemo {
    public static void main(String[] args) {
        System.out.println("Starting payment processing...");
        Payment creditCard = new CreditCardPayment();
        PaymentProcessor processor1 = new DefaultPaymentProcessor(creditCard);
        System.out.println("Processing credit card payment...");
        processor1.process(100.0);


        Payment paypal = new PayPalPayment();
        PaymentProcessor processor2 = new DefaultPaymentProcessor(paypal);
        System.out.println("Processing PayPal payment...");
        processor2.process(200.0);


        Payment bankTransfer = new BankTransferPayment();
        PaymentProcessor processor3 = new DefaultPaymentProcessor(bankTransfer);
        System.out.println("Processing bank transfer payment...");
        processor3.process(300);
    }
}
