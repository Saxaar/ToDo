package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.Task;
import todo.repository.TaskRepository;
import todo.repository.UserRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void addTask(Task task) {
        taskRepository.save(task);
    }
}
