package runoob;

import creational.factory.runoob.ShapeFactory;
import creational.factory.runoob.ShapeType;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 19:10
 */
public class CreationalTest {
    
    @Test
    public void factory() {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape(ShapeType.CIRCLE).draw();
        factory.getShape(ShapeType.SQUARE).draw();
        factory.getShape(ShapeType.RECTANGLE).draw();
    }
}
