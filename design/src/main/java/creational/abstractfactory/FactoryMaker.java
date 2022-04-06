package creational.abstractfactory;

import creational.abstractfactory.interfaces.KingdomFactory;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:58
 */
public class FactoryMaker {
    public static KingdomFactory makeFactory(KingdomType type) {
        return type.constructor.get();
    }
}
