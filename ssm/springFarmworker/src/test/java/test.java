import com.hu.Spring.domain.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public  void a(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
