import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HomeWorkJavaCore4 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('A');
        arr.add('A');
        arr.add('A');
        arr.add('A');
        arr.add('A');
        arr.add('B');
        arr.add('B');
        arr.add('B');
        arr.add('B');
        arr.add('B');
        arr.add('C');
        System.out.println(arr);
        HashSet<Character> set = new HashSet<>(arr);
        System.out.println(set);
        for (Character с : arr)
            System.out.println("element: " + с
                    + ", count: " + Collections.frequency(arr, с));
        PhoneBook.add("Ivanov", "+79852810439");
        PhoneBook.add("Petrov", "+79000000000");
        PhoneBook.add("Petrov", "+79000000001");
        PhoneBook.get_("Petrov");
    }
}
