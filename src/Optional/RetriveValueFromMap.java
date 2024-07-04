package Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RetriveValueFromMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", null);


        String keyToFind = "key2";
        Optional<String> optionalValue = Optional.ofNullable(map.get(keyToFind));


        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println("Value found for key '" + keyToFind + "': " + value);
        } else {
            System.out.println("No value found for key '" + keyToFind + "'.");
        }


        String defaultValue = optionalValue.orElse("Default Value");
        System.out.println("Value or default for key '" + keyToFind + "': " + defaultValue);


        optionalValue.ifPresent(val -> System.out.println("Value in uppercase: " + val.toUpperCase()));
    }
}
