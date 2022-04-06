package creational.abstractfactory.interfaces.impl;

import creational.abstractfactory.interfaces.Army;

/**
 * <p>
 * Description: 兽人军队
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:03
 */
public class OrcishArmy implements Army {
    @Override
    public String getDescription() {
        return getClass().getSimpleName();
    }
}
