package behavioural.observer.mt.task;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.State;
import behavioural.observer.mt.TaskState;
import behavioural.observer.mt.oberver.NotifyObserver;
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
public class TaskPaused implements State {
    private final String state = TaskState.PAUSED.getMsg();
    
    @Override
    public void update(Task task, ActionType actionType) {
        System.out.println("task is paused");
        if (actionType == ActionType.START) {
            TaskOngoing ongoing = new TaskOngoing();
            ongoing.add(new NotifyObserver());
            task.setTaskState(ongoing);
        } else if (actionType == ActionType.EXPIRE) {
            task.setTaskState(new TaskExpired());
        }
    }
}
