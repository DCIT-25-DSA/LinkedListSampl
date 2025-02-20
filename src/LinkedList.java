/**
 * Represents a single node in a singly linked list.
 * Each node contains:
 * - An integer value (`value`) to store data.
 * - A reference (`next`) to the next node in the LinkedList.
 * If `next` is null, it signifies the end of the list.
 */
class ListNode {
    int value; // Data stored in the node
    ListNode next; // Reference to the next node in the list, or null if it's the last node

    /**
     * Constructor to initialize a ListNode instance.
     * @param value The integer value to be stored in the node.
     */
    ListNode(int value) {
        this.value = value;
        this.next = null; // Initialize as a standalone node with no links
    }
}

/**
 * Implements a simple singly linked list structure.
 * The LinkedList class manages a chain of ListNode objects dynamically.
 * Key functionalities include:
 * - Adding a node at the end of the list.
 * - Retrieving the size, accessing a node by index, and deleting nodes by value.
 * - Traversing and printing out the list's contents.
 */
public class LinkedList {
    private ListNode head; // Reference to the first node (head) of the linked list. Null if the list is empty.

    /**
     * Adds a new node to the end of the linked list.
     * Time Complexity: O(n), where n is the number of nodes in the list.
     * Space Complexity: O(1), as no additional data structures are used.
     *
     * @param value The integer value to be stored in the new node.
     */
    public void add(int value) {
        // Create a new node with the provided value
        ListNode newNode = new ListNode(value);

        // Handle the case where the linked list is currently empty
        if (head == null) {
            head = newNode; // The new node becomes the head
            return;
        }

        // Traverse to the last node in the list
        ListNode currentNode = head;
        while (currentNode.next != null) { // Continue until we find the last node
            currentNode = currentNode.next;
        }

        // Link the last node to the new node
        currentNode.next = newNode;
    }

    /**
     * Prints the contents of the linked list in human-readable form.
     * Each node's value is displayed, followed by an arrow (->).
     * At the end of the list, "null" is printed to indicate termination.
     *
     * Example output for list [1, 2, 3]:
     * 1 -> 2 -> 3 -> null
     *
     * Time Complexity: O(n), where n is the number of nodes in the list.
     * Space Complexity: O(1), as printing directly interacts with the console.
     */
    public void printList() {
        ListNode currentNode = head;

        // Traverse the list and print each node's value
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }

        // Indicate the end of the list
        System.out.println("null");
    }

    /**
     * Retrieves the value of a node at a specific index.
     * Indexing is zero-based:
     * - Index 0 corresponds to the first node in the list.
     * - Throws an exception if the index is negative or out of range.
     *
     * Time Complexity: O(n), where n is the index (in the worst case).
     * Space Complexity: O(1), as no additional space is used.
     *
     * @param index The zero-based position of the node within the list.
     * @return The integer value stored at the specified index.
     * @throws IndexOutOfBoundsException If the index is negative or exceeds the list size.
     */
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        ListNode currentNode = head; // Start from the head of the list

        // Traverse to the node at the specified index, maintaining a counter
        for (int currentIndex = 0; currentNode != null; currentIndex++) {
            if (currentIndex == index) {
                return currentNode.value; // Return the value once the index matches
            }
            currentNode = currentNode.next; // Move to the next node
        }

        // If traversal ends without finding the index, throw an exception
        throw new IndexOutOfBoundsException("Index exceeds the size of the linked list");
    }

    /**
     * Counts the total number of nodes in the linked list.
     *
     * Time Complexity: O(n), where n is the number of nodes in the list.
     * Space Complexity: O(1), as no additional memory is used for counting.
     *
     * @return The total number of nodes in the linked list.
     */
    public int size() {
        int count = 0; // Initialize counter
        ListNode currentNode = head;

        // Traverse the list and increment the counter for each node
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        return count; // Return the total count
    }

    /**
     * Deletes a node containing the specified value.
     * - If the value is not found or the list is empty, a message is displayed.
     * - If the value exists multiple times, only the first occurrence is removed.
     *
     * Time Complexity: O(n), where n is the total number of nodes in the list (in the worst case).
     * Space Complexity: O(1), as no auxiliary data structures are used.
     *
     * @param value The value of the node to be deleted.
     */
    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        // Special case: The value is present in the head of the list
        if (head.value == value) {
            head = head.next; // Remove the head by pointing to the next node
            System.out.println("Deleted value: " + value);
            return;
        }

        ListNode currentNode = head; // Start from the head

        // Traverse the list until we find the node preceding the one to be deleted
        while (currentNode.next != null && currentNode.next.value != value) {
            currentNode = currentNode.next;
        }

        // If the value exists in the list, delete it
        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            System.out.println("Deleted value: " + value);
        } else {
            // If the traversal ends without finding the value
            System.out.println("Value " + value + " does not exist in the list.");
        }
    }
}