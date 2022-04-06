package creational.factory.runoob;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 19:05
 */
public class Circle implements Shape {
    @Override
    public void draw() {
       System.out.println(getClass().getSimpleName());
    }
}
