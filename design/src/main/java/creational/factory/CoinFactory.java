package creational.factory;

import creational.factory.interfaces.Coin;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 20:09
 */
public class CoinFactory {
    
    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
