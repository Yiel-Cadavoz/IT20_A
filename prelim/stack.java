package prelim;

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<Integer> grades = new Stack<>();
        
        grades.push(98);
        grades.push(89);
        grades.push(90);
        grades.push(94);
        grades.push(97);
        grades.push(92);
        grades.push(91);
        grades.push(96);
        grades.push(95);
        
        System.out.println("Grades: " + grades);
        
        System.out.println("The total number of elements: " + grades.size());
        
        System.out.println("Top Element: " + grades.peek());
        
        System.out.println("Popped: " + grades.pop());
        System.out.println("Stack after popped: " + grades);
        
        System.out.println("Position of 97: " + grades.search(97));
        
        System.out.println("The Stack is empty: " + grades.empty());
        
        System.out.println("Clearing the Stack...");
        //Clearing the Stack
        
        grades.clear();
        
        System.out.println("The Stack is empty: " + grades.empty());
        
    }
}
