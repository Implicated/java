package creational.abstractfactory.interfaces.impl;

import creational.abstractfactory.interfaces.Army;
import creational.abstractfactory.interfaces.Castle;
import creational.abstractfactory.interfaces.King;
import creational.abstractfactory.interfaces.KingdomFactory;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:56
 */
public class OrcishKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcishCastle();
    }
    
    @Override
    public Army createArmy() {
        return new OrcishArmy();
    }
    
    @Override
    public King createKing() {
        return new OrcishKing();
    }
}
