// Java program to demonstrate a priority queue
import java.util.PriorityQueue;

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



    }
}