package homework58_OV;

public class Task {
    private int id;
    private String description;
    private Status status;

    public Task(int id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", description='" + description + '\'' + ", status=" + status + '}';
    }
}
