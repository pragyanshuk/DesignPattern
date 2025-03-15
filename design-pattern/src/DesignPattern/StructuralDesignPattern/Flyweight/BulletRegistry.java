package DesignPattern.StructuralDesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType,Bullet> bulletMap = new HashMap<>();
    public void registerBullet(BulletType type,Bullet bullet){
        bulletMap.put(type,bullet);
    }
    public Bullet getBullet(BulletType type){
        return bulletMap.get(type);
    }
}
