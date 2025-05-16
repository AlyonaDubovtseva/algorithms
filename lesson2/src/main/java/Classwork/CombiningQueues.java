package Classwork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Queue;

//Даны две непустые очереди.
//Элементы каждой из очередей
//упорядочены по возрастанию.
//Объединить очереди в одну с
//сохранением упорядоченности
//элементов.
//1 2 3 4 7
//1 5 6 8
//1 1 2 3 4 5 6 7 8
public class CombiningQueues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(7);

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(1);
        q2.add(5);
        q2.add(6);
        q2.add(8);
        System.out.println(arrange(q1, q2));
    }
    public static Queue<Integer> arrange(Queue <Integer> q1, Queue <Integer> q2) {
        Deque<Integer> q3 = new ArrayDeque<>();
        while(!q1.isEmpty() && !q2.isEmpty()) {
            if(q1.peek() < q2.peek()) {
                Integer newElem = q1.peek();
                q3.add(newElem);
                q1.remove();
            }
            else if(q1.peek() > q2.peek()) {
                Integer newElem = q2.peek();
                q3.add(newElem);
                q2.remove();
            }
            else  {
                q3.add(q1.poll());
                q3.add(q2.poll());
            }
        }
        while (!q1.isEmpty()) {
            q3.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            q3.add(q2.poll());
        }
        return q3;
    }
}
