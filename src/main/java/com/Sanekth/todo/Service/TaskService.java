package com.Sanekth.todo.Service;

import com.Sanekth.todo.model.Task;
import com.Sanekth.todo.reposiory.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }


    public void creatNewTask(String taskname ) {
        Task task=new Task();
        task.setTitle(taskname);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(long id ) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(long id) {
        Task task =taskRepository.findById(id).orElseThrow(()->new IllegalAccessError("no such id found"));
        task.setCompleted(!task.getCompleted());
        taskRepository.save(task);
    }
}
