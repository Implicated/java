package behavioural.observer.mt.oberver;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:34
 */
public class TaskManageObserver implements Observer {
    /**
     * 过期通知任务管理器
     */
    @Override
    public void response(Long taskId, String msg) {
        System.out.println("notify taskId :" + taskId + " is " + msg);
    }
}
