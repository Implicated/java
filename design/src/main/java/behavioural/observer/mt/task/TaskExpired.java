package behavioural.observer.mt.task;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.State;
import behavioural.observer.mt.Subject;
import behavioural.observer.mt.TaskState;
import lombok.ToString;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:52
 */
@ToString
public class TaskExpired extends Subject implements State {
    private final String state = TaskState.EXPIRE.getMsg();
    
    @Override
    public void update(Task task, ActionType actionType) {
        System.out.println("task is expired");
    }
}
