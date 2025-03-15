package DesignPattern.StructuralDesignPattern.Adapter;

public class BillDeskAdapter implements PaymentGateway{
    @Override
    public String payViaCC(String cardNo, String cvv, String expiryDate) {
        return null;
    }

    @Override
    public boolean checkPaymentStatus(String transId) {
        return false;
    }
}

