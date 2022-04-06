package behavioural.observer.jdk;

import lombok.Data;

import java.util.Observable;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 13:28
 */
@Data
public class Subject extends Observable {
    
    private Integer state;
    
    public void deal(Integer state) {
        this.setChanged();
        this.state = state;
        this.notifyObservers();
    }
}
