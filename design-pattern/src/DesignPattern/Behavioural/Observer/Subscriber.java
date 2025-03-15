package DesignPattern.Behavioural.Observer;

public interface Subscriber {
    public void listen(Order order,EventType eventType);
}
