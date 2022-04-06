package creational.factory.interfaces.impl;

import creational.factory.interfaces.Coin;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 19:57
 */
public class GoldCoin implements Coin {
    @Override
    public String getDescription() {
        return getClass().getSimpleName();
    }
}
