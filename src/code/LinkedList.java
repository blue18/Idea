package code;

public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    // Description - Add new node at the end of the list.
    void addAtTheEnd(int value) {
        // If list is empty, add new node to head.
        if(head == null) {
            head = new Node(value);
        } else {

            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    // Description - Print all of the data in the list.
    void printList() {
        Node current = head;
        System.out.print("[ ");

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("]");
    }
}
