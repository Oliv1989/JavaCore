import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    public static HashMap<String, String> phoneBook = new HashMap<>();
    public static HashMap<Integer, String> lastNameIndexes = new HashMap<>();

    public static void add(String lastName, String phoneNumber){
        phoneBook.put((String) (lastName+'|'+lastNameIndexes.size()),phoneNumber);
        lastNameIndexes.put(lastNameIndexes.size(), lastName);
    }
    public static void get_(String lastName){
        if (!lastNameIndexes.containsValue(lastName)) {
            System.out.println(lastName + "не найдено");
        } else {
            Set<HashMap.Entry<Integer, String>> entrySet = lastNameIndexes.entrySet();
            for (HashMap.Entry<Integer, String> pair : entrySet) {
                if (lastName.equals(pair.getValue())) {
                    System.out.println(phoneBook.get(lastName+'|'+pair.getKey()));
                }
            }
        }
    }
}
