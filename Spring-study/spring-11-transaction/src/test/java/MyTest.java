import com.chen.mapper.UserMapper;
import com.chen.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    private ApplicationContext context;
    private UserMapper userMapper;

    @Before
    public void SetUp() {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userMapper = context.getBean("userMapper", UserMapper.class);
    }

    @Test
    public void testSelect1() {
        List<User> userList = userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }




}
