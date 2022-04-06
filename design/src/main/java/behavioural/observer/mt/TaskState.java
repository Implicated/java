package behavioural.observer.mt;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 02:45
 */
@AllArgsConstructor
@Getter
public enum TaskState {
    INIT("初始化"),
    ONGOING("进行中"),
    PAUSED("暂停中"),
    FINISHED("已完成"),
    EXPIRE("已过期"),
    ;
    private final String msg;
}
