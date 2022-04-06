package runoob;

import behavioural.observer.runoob.Subject;
import behavioural.observer.runoob.Subject_;
import behavioural.observer.runoob.observer.*;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 10:04
 */
public class RunoobTest {
    @Test
    public void observer() {
        Subject subject = new Subject();
        subject.attach(new FirstObserver());
        subject.attach(new SecondObserver());
        subject.send("hello");
    }
    
    @Test
    public void observer_() {
        Subject_ subject_ = new Subject_();
        new BinaryObserver_(subject_);
        new OctalObserver_(subject_);
        new HexObserver_(subject_);
    
        subject_.setState(1);
    }
}
