package prelim;

import java.util.ArrayList;
import java.util.Collections;

public class array_list_demo {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Coconut");
        fruits.add("Dragonfruit");
        fruits.add("Guava");
        fruits.add("Indian Mango");
        fruits.add("Jackfruit");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Lemon");
        
        System.out.println(fruits);
        
        //Iterating
        System.out.println("Iterating: ");
        for (String fruit: fruits){
            System.out.println(fruit);
        }
        
        System.out.print("\n");
        //Accessing Elements
        System.out.println("4th fruit: " + fruits.get(3));
        System.out.println("1st fruit: " + fruits.get(0));
        System.out.println("7th fruit: " + fruits.get(6));
        System.out.println("9th fruit: " + fruits.get(8));
        
        System.out.print("\n");
        //Updating Elements
        fruits.set(4, "Fruit Salad");
        System.out.println(fruits);
        
        System.out.print("\n");
        //Removing Elements
        fruits.remove("Fruit Salad");
        System.out.println(fruits);
        
        System.out.print("\n");
        //Searching Elements
        System.out.println("Do we have Mango? " + fruits.contains("Mango"));
        System.out.println("What number is Guava on the list? " + fruits.indexOf("Guava"));
        
        System.out.print("\n");
        //Size & Empty Check
        System.out.println("How many fruits are there? " + fruits.size());
        System.out.println("Is it empty? " + fruits.isEmpty());
        
        System.out.print("\n");
        //Sorting
        Collections.sort(fruits);
        System.out.println("Ascending: " + fruits);
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Descending: " + fruits);
        
        System.out.println("\n");
        //Clearing the list
        fruits.clear();
        System.out.println("Is it empty? " + fruits.isEmpty());
        
    }
}
