package DesignPattern.StructuralDesignPattern.Flyweight;
//Step 2 - create class which holds only extrinsic properties
/*
extrinsic - properties which can change even after they are set.
 */
public class FlyingBullet {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    private double xSpeed;

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getzSpeed() {
        return zSpeed;
    }

    public void setzSpeed(double zSpeed) {
        this.zSpeed = zSpeed;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    private double ySpeed;
    private double zSpeed;
    private Bullet bullet; // just have the reference of Bullet object which is stored in the registry
}
