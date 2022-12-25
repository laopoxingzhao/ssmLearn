import com.hu.Util.SqlSessionUtil;
import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatistest {
    @Test
    public  void est() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory =  builder.build(stream);
        SqlSession session = factory.openSession(true);//会自动提交
//        SqlSession session = factory.openSession();
//        session.select("slect * from t_user");
        UserMapper mapper = session.getMapper(UserMapper.class);
//        session.commit();
        List<User> userList = mapper.selectUser();
        userList.forEach(System.out::println);

    }
    @Test
    public  void test() {

        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.insertUser(new User(null,"hucc","123",12,"男","3329334227@qq.com"));
//        session.commit();


    }
    @Test
    public  void test1() {

        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        User user = mapper.selectUserByNameAndPassword("hu", "aa");

        Map<String,Object> map = new HashMap<>();
        map.put("username","sss");
        map.put("password",123);
        User user = mapper.selectUserByMap(map);
        System.out.println(user);


    }
}
