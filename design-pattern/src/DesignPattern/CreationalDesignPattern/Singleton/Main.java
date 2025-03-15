package DesignPattern.CreationalDesignPattern.Singleton;

/*
Singleton is a design pattern which is used to create an object. It is used when you want to create only one instance of a class
which is used across all the services.
 */
public class Main {
    public static void main(String args[]){
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        Database db3 = Database.getInstance();
    }
}
