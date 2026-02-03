package com.Sanekth.todo.Controller;

import com.Sanekth.todo.Service.TaskService;
import com.Sanekth.todo.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller()
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public String getTask(Model model)
    {
        List<Task> taskList=taskService.getAllTask();
        model.addAttribute("tasks",taskList);
        return "tasks";
    }
    @PostMapping
    public String createTask(@RequestParam String taskname)
    {
        taskService.creatNewTask(taskname);
        return "redirect:/";
    }
}
