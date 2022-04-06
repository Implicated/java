package creational.singleton;

/**
 * <p>
 * Description: 在 lazySingleton的基础上改进
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/20/22 20:11
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton INSTANCE;
    
    private DoubleCheckSingleton() {
    }
    
    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
