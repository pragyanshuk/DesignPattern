package DesignPattern.CreationalDesignPattern.Singleton;

public class Database {
    /*
    Used static for instance because we want the instance to same across all the objects of the class.
     */
    private static Database instance = null;
    /*
    private constructor is needed because whenever constructor is called it always return new instance of the class.
    Hence if it was public anyone could have called it and would have been created multiple instance of the class Database.
     */
    private Database() {}

    /*
    Static method can be called even if we have zero object of the class. via className.methodName()
    static method can only access static attributes.
    synchronized only allows one thread to go at a time.
     */
    public static Database getInstance(){
        if(instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance =  new Database();
                }
            }
        }
        return instance;
    }

}
