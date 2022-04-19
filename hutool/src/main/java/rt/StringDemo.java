package rt;

import cn.hutool.core.text.StrPool;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/11/22 09:47
 */
public class StringDemo {
    
    @Test
    public void splitAndTrim() {
        String s = ", 1111 , 2222 ,3333,";
        // s = StrPool.COMMA.equals(s.substring(s.length() - 1)) ? s.substring(0, s.length() - 2) : s;
        Stream.of(s.split(StrPool.COMMA)).map(String::trim).forEach(e -> System.out.println(e.length()));//.map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(Stream.of(s.split(StrPool.COMMA)).map(String::trim).map(Integer::parseInt).count());
    }
}
