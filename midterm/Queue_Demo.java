package midterm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {
    public static void main(String[] args){
        Queue <String> myqueue = new LinkedList <String>();
       
        myqueue.offer("March");
        myqueue.offer("April");
        myqueue.offer("May");
        myqueue.offer("June");
        myqueue.offer("July");
        
        System.out.println(myqueue.poll());
        
        System.out.println(myqueue);
        System.out.println(myqueue.peek());
    
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(40);
        pq.add(80);
        pq.add(20);
        pq.add(30);
        pq.add(50);

        System.out.println(pq);
    }
}
