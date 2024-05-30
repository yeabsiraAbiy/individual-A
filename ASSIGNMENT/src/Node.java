public class Node {
    private Task task; // The task associated with this node
    private Node next; // Reference to the next node in the list

    // Constructor that accepts a Task object
    public Node(Task task) {
        this.task = task;
        this.next = null; // Next is initially set to null
    }

    // Method to get the next node
    public Node getNext() {
        return this.next;
    }

    // Method to set the next node
    public void setNext(Node next) {
        this.next = next;
    }

    // Method to get the task
    public Task getTask() {
        return this.task;
    }
}
