package behavioural.observer.runoob.observer;

import behavioural.observer.runoob.Subject_;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 10:21
 */
public class BinaryObserver_ extends Observer_{
    
    public BinaryObserver_(Subject_ subject_) {
        this.subject_ = subject_;
        this.subject_.add(this);
    }
    
    @Override
    public void update() {
        System.out.println(getClass().getSimpleName());
    }
}
