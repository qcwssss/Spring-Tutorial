import com.chen.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // proxy is an interface
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
