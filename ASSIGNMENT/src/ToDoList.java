public class ToDoList {
    private Node head; // Reference to the head of the linked list

    // Method to add a new task to the end of the linked list
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode; // If the list is empty, set newNode as head
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // Traverse to the last node
            }
            current.setNext(newNode); // Add newNode to the end
        }
    }

    // Method to mark a task as completed based on its title
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                break;
            }
            current = current.getNext();
        }
    }

    // Method to display the list of tasks in the to-do list
    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            Task task = current.getTask();
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Status: " + (task.isCompleted() ? " congratulation! you Complete your task" : "you don't Complete your task"));
            System.out.println("------------------------");
            current = current.getNext();
        }
    }
}


