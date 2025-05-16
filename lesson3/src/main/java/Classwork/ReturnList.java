package Classwork;

import java.util.LinkedList;

//## Задача 2
//**Разворот односвязного списка**
//Рекурсивно изменить порядок следования элементов в линейном односвязном списке на обратный.
//
//**Требования:**
//- Не использовать дополнительную память для нового списка
//- Сложность O(n)
public class ReturnList {
    public static class Node<T> {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next) {
            this.next = next;
        }
    }

    public static <T> void printList(Node<T> head) {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        printList(head);

        ReturnList returnList = new ReturnList();
        Node<Integer> reversed = returnList.returnList(head);
        printList(reversed);
    }
    public Node<Integer> returnList(Node<Integer> head) {
        if(head.next == null || head == null) {
            return head;
        }
        Node<Integer> newHead = returnList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

}
