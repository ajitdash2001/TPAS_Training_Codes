package DefaultMethods;

public interface Vehicle {

    void start();
    default void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car implements  Vehicle{
    public void start(){
        System.out.println("Car started");
    }
}