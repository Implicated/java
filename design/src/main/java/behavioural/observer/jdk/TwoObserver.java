package behavioural.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 14:15
 */
public class TwoObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getClass().getSimpleName());
    }
}
