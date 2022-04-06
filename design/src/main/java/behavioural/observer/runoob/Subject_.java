package behavioural.observer.runoob;

import behavioural.observer.runoob.observer.Observer_;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 09:49
 */
@Getter
@ToString
public class Subject_ {
    private final List<Observer_> observers = new ArrayList<>();
    private Integer state;
    
    public void add(Observer_ observer) {
        observers.add(observer);
    }
    
    public void setState(Integer state) {
        this.state = state;
        notifyObservers();
    }
    
    public void remove(Observer_ observer) {
        observers.remove(observer);
    }
    
    private void notifyObservers() {
        for (Observer_ observer : observers) {
            observer.update();
        }
    }
}
