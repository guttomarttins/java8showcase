package cams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class Main {    
    

    public static void main(String[] args) {
        // Iterate Through List Using 'forEach' Method
        iterateListUsingForEach();

        System.out.println();

        // Iterate Through Set Using 'forEach' Method
        iterateSetUsingForEach();

        System.out.println();

        // Iterate Through Map Using 'forEach' Method
        iterateMapUsingForEach();
    }

    /**
     * ** EXAMPLE METHOD #1 ***
     */
    private static void iterateListUsingForEach() {

        /**
         * * List Instantiation :: Type #1 **
         */
        List<String> cList = new ArrayList<>();
        cList.add("India");
        cList.add("USA");
        cList.add("Japan");
        cList.add("Canada");
        cList.add("Singapore");

        /**
         * * List Instantiation :: Type #2 **
         */
        // List<String> cList = Arrays.asList("India", "USA", "Japan", "Canada", "Singapore");
        System.out.println("<------------Iterating List By Passing Lambda Expression-------------->");
        cList.forEach(cName -> System.out.println(cName));

        System.out.println();

        // You Can Even Replace Lambda Expression With Method Reference. Here We Are Passing The Lambda Parameter As It Is To The Method.
        System.out.println("<------------Iterating List By Passing Method Reference--------------->");
        cList.forEach(System.out::println);

        System.out.println();

        // There Is One More Foreach() Method On Stream Class, Which Operates On Stream And Allows You To Use Various Stream Methods E.g. filter(), mapToInt() Etc. 
        System.out.println("<------------Printing Elements Of List By Using 'forEach' Method------------>");
        cList.stream().forEach(System.out::println);

        System.out.println();

        // Using Stream API & Filter.
        System.out.println("<------------Printing Specific Element From List By Using Stream & Filter------------>");
        cList.stream().filter(cname -> cname.startsWith("S")).forEach(System.out::println);

        System.out.println();

        // You Can Also Use 'forEach' With Parallel Stream. In This, The Order Will Not Be Guaranteed.
        System.out.println("<------------Printing Elements Of List By Using Parallel Stream------------>");
        cList.parallelStream().forEach(cName -> System.out.println(cName));
    }

    /**
     * ** EXAMPLE METHOD #2 ***
     */
    private static void iterateSetUsingForEach() {

        Set<String> persons = new HashSet<>();
        persons.add("Java Geek");
        persons.add("Sam");
        persons.add("David");
        persons.add("April O' Neil");
        persons.add("Albus");

        System.out.println("<------------Iterating Set By Passing Lambda Expression-------------->");
        persons.forEach((pName) -> System.out.println(pName));

        System.out.println();

        System.out.println("<------------Iterating Set By Passing Method Reference--------------->");
        persons.forEach(System.out::println);
    }

    /**
     * ** EXAMPLE METHOD #3 ***
     */
    private static void iterateMapUsingForEach() {

        Map<String, String> days = new HashMap<>();
        days.put("1", "SUNDAY");
        days.put("2", "MONDAY");
        days.put("3", "TUESDAY");
        days.put("4", "WEDNESDAY");
        days.put("5", "THURSDAY");
        days.put("6", "FRIDAY");
        days.put("7", "SATURDAY");

        System.out.println("<------------Iterating Map Using 'forEach' Method--------------->");
        days.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }

}
