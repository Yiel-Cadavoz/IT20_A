package prelim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Performance_Test {
    public static void main(String[] args){
        
        int n = 100000;
        
        //ArrayList
        ArrayList<Integer> arraylist = new ArrayList<>();
        long start = System.nanoTime();
        
        //Adding Date
        for (int i = 0; i < n; i++){
            arraylist.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList Performance Time: " + (end - start) + " ns");
        
        //LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<>();
        start = System.nanoTime();
        
        //Adding Date
        for (int i = 0; i < n; i++){
            linkedlist.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Performance Time: " + (end - start) + " ns");
        
        //Stack
        Stack<Integer> stack = new Stack<>();
        start = System.nanoTime();
        
        //Adding Date
        for (int i = 0; i < n; i++){
            stack.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Performance Time: " + (end - start) + " ns");
    }
}
