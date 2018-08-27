package code;

public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        head = null;
    }

    // Description - Add new node at the end of the list
    void addAtTheEnd(int value) {
        // If list is empty, add new node to head
        if (head == null) {

            // Add new node to the list
            head = new Node(value);

            // Update size of list
            size++;
        } else {
        // if not, then add at the end of the list
            Node current = head;

            // Traverse through the list until node is null
            while(current.next != null) { current = current.next; }

            // Add new node to the list
            current.next = new Node(value);

            // Update size of list
            size++;
        }
    }

    // Description - Delete node with a given value
    void deleteNode(int value) {
        Node current = head;

        // If head contains the value
        if(current.data == value) {
            // Delete the first node
            head = current.next;

            // Update size of list
            size--;
        }

        // Traverse the list until the current node is null
        while(current.next != null) {

            // If the node after the current node contains the value
            if(current.next.data == value) {

                // Delete the node after the current node
                current.next = current.next.next;

                // Update size of list
                size--;

                // Exit function
                return;
            } else {
                // Go to next node
                current = current.next;
            }
        }
    }

    // Description - Print all of the data in the list
    void printList() {
        Node current = head;
        System.out.print("[ ");

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    // Description - Get size of list
    int getSize() {
        return this.size;
    }
}
