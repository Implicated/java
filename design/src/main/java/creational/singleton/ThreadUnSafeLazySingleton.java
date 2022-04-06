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
public class ThreadUnSafeLazySingleton {
    private static ThreadUnSafeLazySingleton INSTANCE;
    
    private ThreadUnSafeLazySingleton() {
    }
    
    public static ThreadUnSafeLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadUnSafeLazySingleton();
        }
        return INSTANCE;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
