package creational.factorymethod;

import creational.factorymethod.interfaces.Blacksmith;
import creational.factorymethod.interfaces.Weapon;
import creational.factorymethod.interfaces.impl.ElfBlacksmith;
import lombok.extern.slf4j.Slf4j;


/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/13/22 10:01
 */
@Slf4j
public class App {
    private final static String LOG_INFO = "{} manufacture {}";
    
    public static void main(String[] args) {
        // Weapon weapon = new ElfWeapon(WeaponType.AXE);
        // System.out.println(weapon);
        
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon elfWeapon = elfBlacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(LOG_INFO, elfBlacksmith, elfWeapon);
    }
}
