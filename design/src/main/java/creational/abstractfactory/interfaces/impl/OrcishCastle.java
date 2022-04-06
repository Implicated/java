package creational.abstractfactory.interfaces.impl;

import creational.abstractfactory.interfaces.Castle;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:03
 */
public class OrcishCastle implements Castle {
    @Override
    public String getDescription() {
        return getClass().getSimpleName();
    }
}
