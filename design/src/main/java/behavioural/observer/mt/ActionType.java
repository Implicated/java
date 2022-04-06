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
 * @since 3/11/22 01:57
 */
@AllArgsConstructor
@Getter
public enum ActionType {
    START(1, "开始"),
    STOP(2, "结束"),
    FINISH(3, "完成"),
    EXPIRE(3, "过期"),
    ;
    private final int code;
    private final String msg;
}
