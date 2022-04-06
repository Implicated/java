package creational.abstractfactory;

import creational.abstractfactory.interfaces.KingdomFactory;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 22:13
 */
public class App {
    
    public static void main(String[] args) {
        KingdomFactory kingdomFactory = FactoryMaker.makeFactory(KingdomType.ELF);
        System.out.println(kingdomFactory.createKing().getDescription());
        System.out.println(kingdomFactory.createCastle().getDescription());
        System.out.println(kingdomFactory.createArmy().getDescription());
        System.out.println("------------------------------");
        kingdomFactory = FactoryMaker.makeFactory(KingdomType.ORC);
        System.out.println(kingdomFactory.createKing().getDescription());
        System.out.println(kingdomFactory.createCastle().getDescription());
        System.out.println(kingdomFactory.createArmy().getDescription());
    }
}
