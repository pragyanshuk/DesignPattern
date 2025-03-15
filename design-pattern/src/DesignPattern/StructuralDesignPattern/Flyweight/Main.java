package DesignPattern.StructuralDesignPattern.Flyweight;

import java.util.ArrayList;
import java.util.List;

/*
Flyweight pattern is used when a class have two types of attributes -> intrinsic(which is same for all the objects) and
extrinsic(which is different for all the objects).
It is used to save a lot of memory.
 */
public class Main {
    public static void main(String[] args){
        BulletRegistry bulletRegistry = new BulletRegistry();
        Bullet fiveMmBullet = new Bullet();
        fiveMmBullet.setType(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM,fiveMmBullet);

        Bullet sevenMmBullet = new Bullet();
        sevenMmBullet.setType(BulletType.SEVEN_MM);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM,sevenMmBullet);

        List<FlyingBullet> flyingBulletList = new ArrayList<>();
        for(int i=0;i<2000000;i++){
            if(i%2 == 0){
                FlyingBullet flyingBullet = new FlyingBullet();
                flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
                flyingBulletList.add(flyingBullet);
            }
            else{
                FlyingBullet flyingBullet = new FlyingBullet();
                flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.SEVEN_MM));
                flyingBulletList.add(flyingBullet);
            }
        }
    }
}
