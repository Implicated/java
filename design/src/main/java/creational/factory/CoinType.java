package creational.factory;

import creational.factory.interfaces.Coin;
import creational.factory.interfaces.impl.CopperCoin;
import creational.factory.interfaces.impl.GoldCoin;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 19:53
 */
@RequiredArgsConstructor
@Getter
public enum CoinType {
    GOLD(GoldCoin::new),
    COPPER(CopperCoin::new),
    ;
    private final Supplier<Coin> constructor;
}
