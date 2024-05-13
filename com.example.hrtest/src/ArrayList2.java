import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);
    }
}

