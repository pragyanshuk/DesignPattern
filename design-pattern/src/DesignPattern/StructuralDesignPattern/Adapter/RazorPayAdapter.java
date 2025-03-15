package DesignPattern.StructuralDesignPattern.Adapter;
//Step 2 - create Adapter which calls the RazorPay Apis . Mediator class between Payment Gateway and RazorPay
public class RazorPayAdapter implements PaymentGateway{
    @Override
    public String payViaCC(String cardNo, String cvv, String expiryDate) {
        RazorPay razorPay = new RazorPay();
        Long cardNum = Long.parseLong(cardNo);
        Long CVV = Long.parseLong(cvv);
        Long expiredDate = Long.parseLong(expiryDate);
        return razorPay.payViaCredit(cardNum,CVV,expiredDate);
    }

    @Override
    public boolean checkPaymentStatus(String transId) {
        RazorPay razorPay = new RazorPay();
        return razorPay.checkPaymentStatus(transId);
    }
}
