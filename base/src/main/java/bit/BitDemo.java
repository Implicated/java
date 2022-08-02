package bit;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 8/1/22 01:51
 */
public class BitDemo {

    public static void main(String[] args) {
        // System.out.println(valueAtBit(6, 1));
        // System.out.println(valueAtBit(6, 2));
        // System.out.println(valueAtBit(6, 3));
        for (int i = 0; i < 8; i++) {
            value(i);
            System.out.println("==========");
        }
    }

    private static Integer valueAtBit(Integer num, Integer bit) {
        int i = num >> (bit - 1);
        System.out.println("xx " + i);
        return i & 1;
    }

    private static Integer two(Integer i) {
        return 1 << i;
    }

    private static void value(Integer v) {
        System.out.println("value: " + v);
        System.out.println("no e " + ((v >> 0 & 1) != 0));
        System.out.println("no w " + ((v >> 1 & 1) != 0));
        System.out.println("no r " + ((v >> 2 & 1) != 0));
        // System.out.println("no e " + ((i >> 0 & 1) == 0));
        // System.out.println("no w " + ((i >> 1 & 1) == 0));
        // System.out.println("no r " + ((i >> 2 & 1) == 0));
        // System.out.println("no execute " + ((v ^ 1) != 0));
        // System.out.println("no write " + ((v ^ 2) != 0));
        // System.out.println("no read " + ((v ^ 4) != 0));
    }
}
