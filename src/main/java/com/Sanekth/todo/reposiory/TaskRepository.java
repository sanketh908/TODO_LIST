package com.Sanekth.todo.reposiory;

import com.Sanekth.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
