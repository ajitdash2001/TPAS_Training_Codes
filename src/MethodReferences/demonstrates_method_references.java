package MethodReferences;

import java.util.function.Function;

public class demonstrates_method_references {

    public static String converToupperCase(String input){
        return input.toLowerCase();
    }

    public  static  void main(String[]args){
        Function<String, String> converter = demonstrates_method_references::converToupperCase;


        String result = converter.apply("hello");


        System.out.println("Converted String: " + result);
    }
}
