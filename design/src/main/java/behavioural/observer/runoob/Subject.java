package behavioural.observer.runoob;

import behavioural.observer.runoob.observer.Observer;

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
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    
    public void send(String msg) {
        System.out.println("subject deal something");
        notifyObservers(msg);
    }
    
    private void notifyObservers(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
