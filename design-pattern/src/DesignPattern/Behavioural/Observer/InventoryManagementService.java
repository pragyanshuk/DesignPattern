package DesignPattern.Behavioural.Observer;

public class InventoryManagementService implements Subscriber{
    public InventoryManagementService(){
        Flipkart.getSubscribed(EventType.PLACED_ORDER,this);
    }
    @Override
    public void listen(Order order, EventType eventType) {
        System.out.println("Update inventory for event : " + eventType);
    }

}
