package stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/23/22 02:34
 */
public class StreamDemo {
    @Test
    public void map() {
        Map<String, Integer> map = new HashMap<>();
        map.put("9", 101);
        map.put("11", 100);
        map.put("8", 92);
        map.put("10", 109);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("---------------");
        Map<String, Integer> sortMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e -> sortMap.put(e.getKey(), e.getValue()));
        sortMap.forEach((k, v) -> System.out.println(k + ":" + v));
        
        // appTradeNum.entrySet().stream().sorted(Map.Entry.<Long, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        
    }
}
