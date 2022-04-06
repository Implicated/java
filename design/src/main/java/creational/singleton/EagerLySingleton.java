package creational.singleton;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/20/22 20:11
 */
public class EagerLySingleton {
    private static EagerLySingleton INSTANCE = new EagerLySingleton();
    
    private EagerLySingleton() {
    }
    
    public static EagerLySingleton getInstance() {
        return INSTANCE;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
