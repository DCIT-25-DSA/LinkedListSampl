class ListNode {
    int value; // null -> 1
    ListNode next;

    // Constructor for ListNode
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;

    // Add a new node to the end of the list
    public void add(int value) {
        ListNode newNode = new ListNode(value); // null - > ListNode = 1
        if (head == null) {
            head = newNode; // 2nd step, this will instantiate line 13
        } else {
            ListNode currentNode = head; // 1
            while (currentNode.next != null) { //4  has value of 10 after add
                currentNode = currentNode.next; //null - > 1 -> 2
            }
            currentNode.next = newNode; //null
        }
    }

    // Print the contents of the linked list
    public void printList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }


    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        ListNode currentNode = head;

        for (int currentIndex = 0; currentNode != null; currentIndex++) {
            if (currentIndex == index) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        // If we exhausted the list and didn't find the index
        throw new IndexOutOfBoundsException("Index exceeds the size of the linked list");
    }

    public int size() {
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        if (head.value == value) {
            head = head.next;
            System.out.println("Deleted value: " + value);
            return;
        }

        ListNode currentNode = head;

        while (currentNode.next != null && currentNode.next.value != value) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            System.out.println("Deleted value: " + value);
        } else {
            System.out.println("Value " + value + " does not exist in the list.");
        }
    }
}