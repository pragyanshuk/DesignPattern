package DesignPattern.StructuralDesignPattern.Flyweight;
//Step 1 - create class which only holds the intrinsic properties
/*
intrinsic - properties which are set for the object will never change
 */
public class Bullet {
    private double radius;
    private double weight;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BulletType getType() {
        return type;
    }

    public void setType(BulletType type) {
        this.type = type;
    }

    private byte[] image;
    private BulletType type;
}
