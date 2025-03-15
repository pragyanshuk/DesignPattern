package DesignPattern.Behavioural.Observer;

public class EmailService implements Subscriber{
    public EmailService(){
        Flipkart.getSubscribed(EventType.PLACED_ORDER,this);
    }
    @Override
    public void listen(Order order, EventType eventType) {
        System.out.println("Send email for event : " + eventType);
    }
}
