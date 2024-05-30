public class Main {
    public static void main(String[] args) {
        ToDoList myList = new ToDoList();

        // Adding tasks to the to-do list
        myList.addToDo(new Task("Grocery Shopping", "Buy milk,eggs,bread,coffee"));
        myList.addToDo(new Task("Laundry", "Wash my clothes"));
        myList.addToDo(new Task("Study", "finishing DSA Assignment "));
        myList.addToDo(new Task("Learning New Skill", "going to chinese class"));

        // Marking ended tasks as completed
        myList.markToDoAsCompleted("Grocery Shopping");
        myList.markToDoAsCompleted("Study");

        // Viewing the to do list
        myList.viewToDoList();


    }
}
