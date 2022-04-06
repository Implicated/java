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
public class LazySingleton {
    private static LazySingleton INSTANCE;
    
    private LazySingleton() {
    }
    
    public synchronized static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
