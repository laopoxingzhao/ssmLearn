import com.hu.mybatis.mapper.BookMapper;
import com.hu.mybatis.mapper.impl.BookMapperImpl;
import com.hu.mybatis.pojo.Book;
import org.junit.Test;

public class BookTest {

    @Test
    public void getBookName(){
        BookMapper mapper = new BookMapperImpl();
        String name = (String) mapper.getBookName();
        System.out.println(name);


    }
    @Test
    public void getBook(){
     BookMapper mapper = new BookMapperImpl();
        Book huo = mapper.getBook("huo");
        System.out.println(huo);
    }
}
