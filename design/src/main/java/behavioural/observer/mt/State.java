package behavioural.observer.mt;

import behavioural.observer.mt.task.Task;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:38
 */
public interface State {
    default void update(Task task, ActionType actionType) {
    }
}
