package todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.model.User;
import todo.repository.UserRepository;
import todo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/all")
    @ResponseBody
    public ResponseEntity<List<User>> getUsers()  {
        return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
    }

}
