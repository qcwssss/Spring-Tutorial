import com.chen.demo1.ProxyInvocationHandler;
import com.chen.demo2.UserService;
import com.chen.demo2.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
//        Real object
        UserServiceImpl userService = new UserServiceImpl();
//        Proxy object calls invocation handler
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();
        proxy.query();
        proxy.update();


    }
}
