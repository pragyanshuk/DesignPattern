package DesignPattern.StructuralDesignPattern.Adapter;
//Step1 which have the methods or services which is required by us from different payment gateway.
public interface PaymentGateway {
    public String payViaCC(String cardNo,String cvv,String expiryDate);
    public boolean checkPaymentStatus(String transId);
}
