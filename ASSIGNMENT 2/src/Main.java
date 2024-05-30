public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Insert nodes into the linked list
        myList.insertAtPos(10, 1); // Insert at head
        myList.insertAtPos(20, 2); // Insert at second position
        myList.insertAtPos(30, 3); // Insert at third position
        myList.insertAtPos(40, 2); // Insert at second position
        myList.insertAtPos(50, 3); // Insert at third position
        //displaying the inserted data in the node
        System.out.println("the original list before deletion");
        myList.displayList();

        // Delete nodes from the linked list
        myList.deleteAtPosition(3);

        //displaying the inserted data in the node after deletion
        System.out.println("the list after deleting specific node");
        myList.displayList();

        // Search for a node in the linked list
        boolean found = myList.searchNode(50); // Search for value 20
        System.out.println("Search result for value 50: " + (found ? " the node is in the list " : "the node is not found in the list"));


        // Create a Stack instance
        //push an element in to the stack
        Stack myStack = new Stack();
        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        myStack.push(400);
        myStack.push(500);

        // Pop an element from the stack
        int poppedValue = myStack.pop();
        System.out.println("Popped value1: " + poppedValue);

        // Peek the top element of the stack
        int peekedValue = myStack.peek();
        System.out.println("Peeked value: " + peekedValue);
    }
}
