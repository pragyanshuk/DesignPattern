package DesignPattern.StructuralDesignPattern.Adapter;
/*
It is used when u have to interact with multiple 3rd party Apis class.
For eg Flipkart Payments team have to integrate with different gateways like RazorPay , BillDesk , PayUMoney etc.
Step 1 - create interface which have all the methods u are required from different gateways lets say it name is PaymentGateway.
Step 2 - Create Adapter class like RazorPayAdapter , BillDeskAdapter which will implements Payment Gateway methods.
Step 3 - Write a code inside methods of RazorPayAdaptor which will call RazorPay Apis for payments.
 */
public class Main {
    public static void main(String[] args){
        Flipkart flipkart = new Flipkart(new RazorPayAdapter());
        if(flipkart.payViaCreditCard("111111","234","180728")){
            System.out.println("congrats");
        }
    }
}
