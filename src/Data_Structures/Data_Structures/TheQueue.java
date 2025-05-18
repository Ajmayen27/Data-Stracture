package Data_Structures.Data_Structures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {

        Queue<person> queue = new LinkedList<>();
        queue.add(new person("Ajmayen",24));
        queue.add(new person("Bobby",25));
        queue.add(new person("David",26));
        queue.add(new person("Daniel",27));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

    public static record person(String name, int age){

    }
}
