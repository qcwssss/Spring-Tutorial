import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.xml.StaxUtils;
import pojo.Student;
import pojo.User;

public class MyTest {

    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
//        System.out.println(user.toString());

        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2==user1);

    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());;
    }
}
