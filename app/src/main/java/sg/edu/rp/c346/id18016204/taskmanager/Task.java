package sg.edu.rp.c346.id18016204.taskmanager;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Task implements Serializable {
    private int id;
    private String task;
    private String description;

    public Task(int id, String task, String description) {
        this.id = id;
        this.task = task;
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return task + "\n" + description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
