package DesignPattern.StructuralDesignPattern.Adapter;

public class Flipkart {
    private PaymentGateway paymentGateway;
    public Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public boolean payViaCreditCard(String cardNo,String cvv,String expiryDate){
        String transId = paymentGateway.payViaCC(cardNo, cvv, expiryDate);
        if(paymentGateway.checkPaymentStatus(transId)){
            System.out.println("Payment Successful");
            return true;
        }
        else{
            System.out.println("Payment Failed");
            return false;
        }
    }
}
