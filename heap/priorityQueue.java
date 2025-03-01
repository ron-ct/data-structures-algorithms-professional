// Java program to demonstrate a priority queue
import java.util.*;

public class priorityQueue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add elements
        pq.add(100);
        pq.add(200);
        pq.add(300);

        //print top element
        System.out.println(pq.peek());

        //print and remove top element
        System.out.println(pq.poll());

        //print top element again
        System.out.println(pq.peek());

        // adding elements
        //insertion order is not maintained by priority queue.
        //elements are stored based on the priority order ascending by default
        for(int i =0; i<10;i++){
            pq.add(i);
            pq.add(1);

        }
        System.out.println(pq);

        //remove top element
        pq.poll();

        //remove specific element
        pq.remove(7);

        //check if queue has a specific element
        System.out.println("Does the priority queue contain 3? " + pq.contains(3));

        //check size of priority queue
        System.out.println("Size of the queue: "+pq.size());

        //remove all elements
        //pq.clear();

        //check if queue is empty
        System.out.println("Queue is empty?"+ pq.isEmpty());

    }
}