import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList object
        LinkedList linkedList = new LinkedList(); //1

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(30);
        linkedList.add(35);
        linkedList.add(40);
        linkedList.printList();

        linkedList.delete(2);
        linkedList.delete(4);
        linkedList.delete(35);
        linkedList.printList();
    }
}