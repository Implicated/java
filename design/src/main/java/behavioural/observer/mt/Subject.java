package behavioural.observer.mt;

import behavioural.observer.mt.oberver.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description: 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:25
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();
    
    public void add(Observer observer) {
        observers.add(observer);
    }
    
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObserver(Long taskId, String msg) {
        for (Observer observer : observers) {
            observer.response(taskId, msg);
        }
    }
}
