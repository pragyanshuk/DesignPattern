package DesignPattern.Behavioural.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Step 1 - Create a publisher class which have an interesting event inside it.
public class Flipkart {
    public static Map<EventType , List<Subscriber>> subscriberList = new HashMap<>();

    public static void getSubscribed(EventType eventType,Subscriber subscriber){
        if(!subscriberList.containsKey(eventType)){
            subscriberList.put(eventType,new ArrayList<>());
        }
        subscriberList.get(eventType).add(subscriber);
        System.out.println(subscriber + " successfully subscribed for event : " + eventType);
    }
    public void notifySubscriber(EventType eventType,Order order){
        List<Subscriber> subscribers = subscriberList.get(eventType);
        for(Subscriber subscriber : subscribers){
            subscriber.listen(order, eventType);
        }
    }
    public void placeOrder(EventType eventType, Order order){
       notifySubscriber(eventType,order);
    }
}
