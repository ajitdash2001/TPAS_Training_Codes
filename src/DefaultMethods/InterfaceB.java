package DefaultMethods;

public interface InterfaceB {
    default void defaultMethod(){
        System.out.println("Default method from interface B");
    }
}
