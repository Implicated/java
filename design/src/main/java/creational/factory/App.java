package creational.factory;

import lombok.var;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 22:27
 */
public class App {
    public static void main(String[] args) {
        var description = CoinFactory.getCoin(CoinType.GOLD).getDescription();
        System.out.println(description);
    }
}
