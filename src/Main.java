import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        initializeAndModifyLinkedList();
        calculateAndPrintFactorial();
    }

    public static void initializeAndModifyLinkedList() {
        // ------------ Step 1: Initialize a new LinkedList ------------ //
        // Create an instance of LinkedList. Initially, the linked list
        // will be empty (i.e., no `head` node).
        LinkedList linkedList = new LinkedList();
        // ------------ Step 2: Add elements to the LinkedList ------------ //
        // Add nodes with values 3, 2, 1  in sequential order
        // to the linked list. The `add` method ensures the values are
        // appended to the *end* of the list, maintaining insertion order.
        linkedList.add(3);   // List becomes: 3 ->
        linkedList.add(2);   // List becomes: 3 -> 2 ->
        linkedList.add(1);  // List becomes: 3 -> 2 -> 1 ->
        linkedList.printList();

        linkedList.delete(2);
        linkedList.printList();
        linkedList.delete(5);
        linkedList.printList();
    }


    public static void calculateAndPrintFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int result = Recursive.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
    }



}