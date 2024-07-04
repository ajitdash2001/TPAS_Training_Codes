package DefaultMethods;

public interface InterfaceA {
    default void defaultMethod(){
        System.out.println("Defult method from InterfaceA");
    }
}
class ImplementingClass implements InterfaceA,InterfaceB{

    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();


    }
}