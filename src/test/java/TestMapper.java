import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMapper {

    private ApplicationContext applicationContext = null;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void userTest(){
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.selectUserById(10);
        System.out.println(user);
    }

    @Test
    public void Report(){
        UserMapper mapper = applicationContext.getBean(UserMapper.class);
        List<User> users = mapper.reportOrders();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
