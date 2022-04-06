package behavioural.observer.mt.task;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.State;
import behavioural.observer.mt.Subject;
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
 * @since 3/11/22 01:40
 */
@ToString
public class TaskInit extends Subject implements State {
    private final String state = TaskState.INIT.getMsg();
    
    @Override
    public void update(Task task, ActionType actionType) {
        System.out.println("task is init");
        if (actionType == ActionType.START) {
            TaskOngoing ongoing = new TaskOngoing();
            ongoing.add(new NotifyObserver());
            task.setTaskState(ongoing);
        }
    }
}
