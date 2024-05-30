class LinkedList {
    Node head;

    // 1. Inserting a Node at Any Given Position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; current != null && i < position - 1; i++) {
                current = current.next;
            }
            if (current == null) return;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // 2. Deleting a Node at Any Given Position
    public void deleteAtPosition(int position) {
        if (head == null) return;
        Node temp = head;
        if (position == 1) {
            head = temp.next;
            return;
        }
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        Node next = temp.next.next;
        temp.next = next;
    }

    // 3. Deleting a Node After a Given Node
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) return;
        prevNode.next = prevNode.next.next;
    }

    // 4. Searching a Node in a Singly Linked List
    public boolean searchNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //5.method to display the inserted node
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
