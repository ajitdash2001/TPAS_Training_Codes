package MethodReferences;

import java.util.function.Function;

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }

    public  String getName(){
        return name;
    }
}
public class instancematheod {
    public static void main(String[] args) {
        Person person = new Person("Ajit");

        Function<Person,String> getNameFunction = Person::getName;

        String name = getNameFunction.apply(person);

        System.out.println("Person's name:"+name);
    }
}
