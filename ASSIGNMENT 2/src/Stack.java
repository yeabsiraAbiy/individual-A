class Stack {
    private Node top;

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek operation
    public int peek() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        return top.data;
    }
}
