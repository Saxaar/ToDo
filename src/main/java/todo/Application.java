package todo;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import todo.model.Role;
import todo.model.User;
import todo.repository.UserRepository;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   @Bean
    public InitializingBean setUser(UserRepository userRepository){
        return ()->{
            User user = new User();
            user.setLogin("admin");
            user.setPassword("admin");
            user.setRole(Role.ADMIN);
            userRepository.save(user);
        };
   }
}
