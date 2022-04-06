import behavioural.observer.jdk.OneObserver;
import behavioural.observer.jdk.Subject;
import behavioural.observer.jdk.TwoObserver;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 14:18
 */
public class JDKTest {
    @Test
    public void test() {
        Subject subject = new Subject();
        subject.addObserver(new OneObserver());
        subject.addObserver(new TwoObserver());
        subject.deal(1);
    }
}
