package mt;

import behavioural.observer.mt.ActionType;
import behavioural.observer.mt.task.Task;
import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 02:24
 */
public class MtTest {
    @Test
    public void observer() {
        Task task = new Task();
        task.setTaskId(9999L);
        System.out.println("-----------");
        task.updateState(ActionType.START);
        task.updateState(ActionType.STOP);
        task.updateState(ActionType.START);
        // task.updateState(ActionType.FINISH);
        task.updateState(ActionType.EXPIRE);
        System.out.println(task.getTaskState());
        System.out.println("-----------");
    }
}
