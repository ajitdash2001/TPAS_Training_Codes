package Optional;

import java.util.Optional;

public class HandelPotentialNullValue {
    public static void main(String[] args) {
        String nullableValue=null;

        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        if(optionalValue.isPresent()){
            String value = optionalValue.get();
            System.out.println("Value is Present"+value);
        }
        else{
            System.out.println("value is not present");
        }
        String defaultValue = optionalValue.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue);


        optionalValue.ifPresent(val -> System.out.println("Value in uppercase: " + val.toUpperCase()));
    }
}
