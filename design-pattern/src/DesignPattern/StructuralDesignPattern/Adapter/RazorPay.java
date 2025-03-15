package DesignPattern.StructuralDesignPattern.Adapter;
/*
RazorPay - 3rdParty Api class
 */
public class RazorPay {
    public String payViaCredit(Long cardNo, Long cvv ,Long expiryDate){
        System.out.println("RazorPay in action");
        return "RazorPay";
    }
    public boolean checkPaymentStatus(String Id){
        return Id == "RazorPay";
    }
}
