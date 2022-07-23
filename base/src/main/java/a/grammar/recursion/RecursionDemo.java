package a.grammar.recursion;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 7/22/22 18:04
 */
public class RecursionDemo {
    private static int index = 5;

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println(index);
        b(index);
    }

    private static void b(int i) {
        System.out.println(index);
        if (index-- > 0) {
            a();
        }
    }
}
