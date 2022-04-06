package behavioural.observer.mt.oberver;

/**
 * <p>
 * Description: 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:27
 */
public interface Observer {
    void response(Long taskI, String msg);
}
