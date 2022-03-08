import lombok.SneakyThrows;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/8/22 23:58
 */
public class SneakThrows {
    
    @SneakyThrows
    private void run() {
        throw new Exception();
    }
    
    @SneakyThrows
    private String toString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }
    
    // ------------------------------------------------------------------------------------------------------------
    @Test
    public void one() {
        RuntimeException xx = (RuntimeException) xx(new Test0Exception());
        // 不能通过编译
        // RuntimeException e0 = (RuntimeException) new Test0Exception();
        RuntimeException e1 = (RuntimeException) new Test1Exception();
    }
    
    private <T extends Throwable> T xx(Throwable e) {
        return (T) e;
    }
    
    public class Test0Exception extends Exception {
    }
    
    public class Test1Exception extends RuntimeException {
    }
}
