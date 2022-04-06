package behavioural.observer.mt.task;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.State;
import lombok.Data;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 01:54
 */
@Data
public class Task {
    private Long taskId;
    
    private State taskState = new TaskInit();
    
    public void updateState(ActionType actionType) {
        taskState.update(this, actionType);
    }
}
