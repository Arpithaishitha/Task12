import java.util.*;

public class TreeMap3 {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employees to the TreeMap
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Jane Smith");
        employeeMap.put(103, "Alice Johnson");
        employeeMap.put(104, "Bob Brown");

        // Print the names of all employees in alphabetical order
        System.out.println("Names of employees in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}

