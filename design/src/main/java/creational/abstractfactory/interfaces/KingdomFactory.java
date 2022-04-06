package creational.abstractfactory.interfaces;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:53
 */
public interface KingdomFactory {
    Castle createCastle();
    Army createArmy();
    King createKing();
}
