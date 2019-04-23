import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public void phoneBook() {

        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        int numOfEntries = in.nextInt(); //number of entries
        for (int i = 0; i < numOfEntries; i++) {
            System.out.print("enter name: ");
            String name = in.next();
            System.out.print("phone #: ");
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {   // check if the scanner has a token = true
            String name = in.next(); //stores String for key:value lookup
            if (phoneBook.containsKey(name)) {
                System.out.printf("%s=%s\n", name, phoneBook.get(name)); //.get() returns the value NOT key!
            } else {
                System.out.println("Not Found");
            }

        }


        in.close();
    }
}
