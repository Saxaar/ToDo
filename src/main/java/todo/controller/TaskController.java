package todo.controller;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.model.Task;
import todo.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    @ResponseBody
    public ResponseEntity<String> addTask(@RequestBody Task task){
        taskService.addTask(task);
        return new ResponseEntity<String>("new data is created", HttpStatus.CREATED);
    }
}
