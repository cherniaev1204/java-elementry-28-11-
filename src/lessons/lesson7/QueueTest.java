package lessons.lesson7;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> strings = new PriorityQueue<>();

        strings.add("C");

        System.out.println(strings.toString());

        strings.add("A");
        System.out.println(strings.toString());
        strings.add("B");
        System.out.println(strings.toString());
        strings.add("D");
        System.out.println(strings.toString());

        Queue<Integer> ints = new PriorityQueue<>();
        ints.add(3);
        System.out.println(ints.toString());
        ints.add(1);
        System.out.println(ints.toString());
        ints.add(2);
        System.out.println(ints.toString());
        ints.add(4);
        System.out.println(ints.toString());

        ints.offer(5);
        System.out.println(ints.toString());

        System.out.println("Poll: ");
        System.out.println(ints.poll());
        System.out.println(ints.poll());
        System.out.println(ints.poll());
        System.out.println(ints.poll());
        System.out.println(ints.poll());

    }
}
