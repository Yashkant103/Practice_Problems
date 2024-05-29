import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the linked list elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i : h) {
            singlyLinkedList.insert(i);
        }
        System.out.print("Original linked list : ");
        singlyLinkedList.printList();
        singlyLinkedList.reverse();
        System.out.print("Reversed linked list : ");
        singlyLinkedList.printList();
    }
}
class SinglyLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}