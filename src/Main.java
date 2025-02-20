import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ------------ Step 1: Initialize a new LinkedList ------------ //
        // Create an instance of LinkedList. Initially, the linked list
        // will be empty (i.e., no `head` node).
        LinkedList linkedList = new LinkedList();

        // ------------ Step 2: Add elements to the LinkedList ------------ //
        // Add nodes with values 1, 2, 30, 35, and 40 in sequential order
        // to the linked list. The `add` method ensures the values are
        // appended to the *end* of the list, maintaining insertion order.
        linkedList.add(1);   // List becomes: 1 ->
        linkedList.add(2);   // List becomes: 1 -> 2 ->
        linkedList.add(30);  // List becomes: 1 -> 2 -> 30 ->
        linkedList.add(35);  // List becomes: 1 -> 2 -> 30 -> 35 ->
        linkedList.add(40);  // List becomes: 1 -> 2 -> 30 -> 35 -> 40 -> null

        // ------------ Step 3: Print the LinkedList ------------ //
        // Prints the contents of the entire linked list, starting at the `head` node.
        // Each node's value is shown, pointing to the next node, until the end
        // of the list (indicated with "null").
        // Output Example: "1 -> 2 -> 30 -> 35 -> 40 -> null"
        linkedList.printList();

        // ------------ Step 4: Delete nodes based on their value ------------ //
        // The `delete` method removes nodes with the specified value from the linked list.
        // It will search the list:
        // - Remove the first occurrence of the value, if the value exists.
        // - If the value does not exist, display an appropriate message.
        // NOTE: The delete operation does NOT affect the order of other nodes.

        // Case 1: Delete a value that exists in the list (2 exists, so it will be removed).
        // When 2 is deleted, the list becomes: 1 -> 30 -> 35 -> 40 -> null
        linkedList.delete(2);

        // Case 2: Delete a value that DOES NOT exist in the list (4 is not in the list).
        // No changes are made to the list, and a notice is displayed.
        linkedList.delete(4);

        // Case 3: Delete another value that exists in the list (35 exists, so it will be removed).
        // When 35 is deleted, the list becomes: 1 -> 30 -> 40 -> null
        linkedList.delete(35);

        // ------------ Step 5: Print the updated LinkedList ------------ //
        // Prints the list again to verify the updated contents after the delete operations.
        // Following the deletions, the list will display: "1 -> 30 -> 40 -> null"
        linkedList.printList();
    }
}