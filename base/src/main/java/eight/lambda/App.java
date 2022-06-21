package eight.lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/19/22 12:52
 */
public class App {
    // Lambda表达式的书写形式
    Runnable run = () -> System.out.println("Hello World");// 1
    ActionListener listener = event -> System.out.println("button clicked");// 2
    Runnable multiLine = () -> {// 3 代码块
        System.out.print("Hello");
        System.out.println(" Hoolee");
    };
    BinaryOperator<Long> add = (Long x, Long y) -> x + y;// 4
    BinaryOperator<Long> addImplicit = (x, y) -> x + y;// 5 类型推断
}
