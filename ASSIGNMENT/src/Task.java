
public class Task {
    private String title; // The title of the task
    private String description; // The description of the task
    private boolean completed; // Whether the task is completed

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Tasks start as not completed
    }

    // Getter for the title
    public String getTitle() {
        return this.title;
    }

    // Getter for the description
    public String getDescription() {
        return this.description;
    }

    // Method to check if the task is completed
    public boolean isCompleted() {
        return this.completed;
    }

    // Method to mark the task as completed
    public void markCompleted() {
        this.completed = true;
    }
}

