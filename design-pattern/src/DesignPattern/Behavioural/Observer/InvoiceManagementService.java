package DesignPattern.Behavioural.Observer;

public class InvoiceManagementService implements Subscriber{
    public InvoiceManagementService(){
        Flipkart.getSubscribed(EventType.PLACED_ORDER,this);
    }
    @Override
    public void listen(Order order, EventType eventType) {
        System.out.println("Create invoice for event : " + eventType);
    }
}
