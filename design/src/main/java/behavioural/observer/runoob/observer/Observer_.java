package behavioural.observer.runoob.observer;

import behavioural.observer.runoob.Subject_;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 10:11
 */
public abstract class Observer_ {
    protected Subject_ subject_;
    
    public abstract void update();
}
