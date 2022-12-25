import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class SQLFactory {

    static {

    }

public static void main(String[] args) throws IOException {
//    String resource = "mybatis-config.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
////    try(SqlSession session = sqlSessionFactory.openSession()){
////        Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
////    }
//    try (SqlSession session = sqlSessionFactory.openSession())
//    {
//        UserMapper userMapper = session.getMapper(UserMapper.class);
////        int user = userMapper.insertUser(new User(1,"hu","123",12,"男","3329334227@qq.com"));
//        User i = userMapper.selectUser(1);
//        System.out.println(i);
//    }


}

}
