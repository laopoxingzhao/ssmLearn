import com.hu.mybatis.Util.SqlSessionUtil;
import com.hu.mybatis.mapper.UserMapper;
import com.hu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
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
        int i = mapper.insertUser(new User(null,"huc嘎嘎嘎cll","123",12,"男","3329334227@qq.com"));
//        session.commit();


    }
    @Test
    public  void test1() {

        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserByNameAndPassword("jj", "kk");

//        Map<String,Object> map = new HashMap<>();
//        map.put("username","sss");
//        map.put("password",123);
//        User user = mapper.selectUserByMap(map);
        System.out.println(user);
        session.close();


    }
    @Test
    public  void test_selectUserByIdToMap(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectUserByIdToMap(1);
        System.out.println(map);
        //{password=kk, gender=男, id=1, age=12, email=11, username=jj}
    }
    @Test
    public  void test_selectAllUserToMap(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        List<Map<String, Object>> maps = mapper.selectAllUserToMap();

        //[{password=kk, gender=男, id=1, age=12, email=11, username=jj},
        // {password=123, gender=男, id=13, age=12, email=3329334227@qq.com, username=hucc},
        // {password=123, gender=男, id=17, age=12, email=3329334227@qq.com, username=hucc},
        // {password=123, gender=男, id=18, age=12, email=3329334227@qq.com, username=huccll},
        // {password=123, gender=男, id=19, age=12, email=3329334227@qq.com, username=huccll},
        // {password=123, gender=男, id=20, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll},
        // {password=123, gender=男, id=21, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll},
        // {password=123, gender=男, id=22, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll}]

//        System.out.println(maps);


        Map<String, Object> map = mapper.selectAllUserToMap();
        System.out.println(map);
//        {1={password=kk, gender=男, id=1, age=12, email=11, username=jj},
//        17={password=123, gender=男, id=17, age=12, email=3329334227@qq.com, username=hucc},
//        18={password=123, gender=男, id=18, age=12, email=3329334227@qq.com, username=huccll},
//        19={password=123, gender=男, id=19, age=12, email=3329334227@qq.com, username=huccll},
//        20={password=123, gender=男, id=20, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll},
//        21={password=123, gender=男, id=21, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll},
//        22={password=123, gender=男, id=22, age=12, email=3329334227@qq.com, username=huc嘎嘎嘎cll},
//        13={password=123, gender=男, id=13, age=12, email=3329334227@qq.com, username=hucc}}

    }
}
