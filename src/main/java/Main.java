import com.example.technova.Entity.User;
import com.example.technova.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get UserService bean from the IoC container
        UserService userService = (UserService) context.getBean("userService");

        // Create and add a new user
        User user = new User();
        user.setFirstName("Yassir");
        user.setLastName("Example");
        user.setEmail("yassir@example.com");

        userService.addUser(user);

        // Retrieve and print all users
        for (User u : userService.getAllUsers()) {
            System.out.println(u.getFirstName() + " " + u.getLastName() + " (" + u.getEmail() + ")");
        }
    }
}
