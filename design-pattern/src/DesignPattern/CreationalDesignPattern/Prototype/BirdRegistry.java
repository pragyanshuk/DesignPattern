package DesignPattern.CreationalDesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private Map<String,Bird> birdMap = new HashMap<>();

    public void registerBird(String type,Bird bird){
        birdMap.put(type,bird);
    }
    public Bird getCopy(String type){
        return birdMap.get(type).cloneBird();
    }
}
