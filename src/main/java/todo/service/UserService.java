package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.User;
import todo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAll() {
        List<User> list = userRepository.findAll();
        if (list.isEmpty()){
            throw new RuntimeException("No data found");
        }
        return list;
    }
}
