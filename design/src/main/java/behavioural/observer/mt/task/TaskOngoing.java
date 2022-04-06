package behavioural.observer.mt.task;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.State;
import behavioural.observer.mt.Subject;
import behavioural.observer.mt.TaskState;
import behavioural.observer.mt.oberver.TaskManageObserver;
import lombok.ToString;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:51
 */
@ToString
public class TaskOngoing extends Subject implements State {
    private final String state = TaskState.ONGOING.getMsg();
    
    @Override
    public void update(Task task, ActionType actionType) {
        System.out.println("task is ongoing");
        if (actionType == ActionType.FINISH) {
            task.setTaskState(new TaskFinished());
            notifyObserver(task.getTaskId(), TaskState.FINISHED.getMsg());
        } else if (actionType == ActionType.STOP) {
            task.setTaskState(new TaskPaused());
        } else if (actionType == ActionType.EXPIRE) {
            TaskExpired expired = new TaskExpired();
            expired.add(new TaskManageObserver());
            task.setTaskState(expired);
            notifyObserver(task.getTaskId(), TaskState.EXPIRE.getMsg());
        }
    }
}
