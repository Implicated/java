package creational.singleton;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/20/22 20:13
 */
@SuppressWarnings({"rawtypes", "Convert2Lambda", "unchecked"})
public class App {
    
    @Test
    public void noThreadSafe() {
        new Thread(() -> System.out.println(ThreadUnSafeLazySingleton.getInstance())).start();
        new Thread(() -> System.out.println(ThreadUnSafeLazySingleton.getInstance())).start();
    }
    
    @Test
    public void threadSafe() {
        // new Thread(() -> System.out.println(LazySingleton.getInstance())).start();
        // new Thread(() -> System.out.println(LazySingleton.getInstance())).start();
        
        new Thread(() -> System.out.println(EagerLySingleton.getInstance())).start();
        new Thread(() -> System.out.println(EagerLySingleton.getInstance())).start();
    }
    
    private void check(Class c) {
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println(c.getMethod("getInstance").invoke(null));
            }
        }).start();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println(c.getMethod("getInstance").invoke(null));
            }
        }).start();
    }
    
    public static <T> T get(Class<T> clz, Object o) {
        if (clz.isInstance(o)) {
            return clz.cast(o);
        }
        return null;
    }
    
    
}
