package behavioural.observer.runoob.observer;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 09:54
 */
public class SecondObserver extends Observer{
    @Override
    public void update(String msg) {
        System.out.println("update second");
    }
}
