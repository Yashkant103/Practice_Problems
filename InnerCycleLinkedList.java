public class InnerCycleLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListCycle singlyLinkedList = new SinglyLinkedListCycle();
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head.next;
        singlyLinkedList.head = head;
        System.out.println("Has cycle : " + singlyLinkedList.hasCycle());
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedListCycle {
    Node head;
    boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}