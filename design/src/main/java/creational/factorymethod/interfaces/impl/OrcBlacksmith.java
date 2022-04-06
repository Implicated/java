package creational.factorymethod.interfaces.impl;

import creational.factorymethod.WeaponType;
import creational.factorymethod.interfaces.Blacksmith;
import creational.factorymethod.interfaces.Weapon;

import java.util.Arrays;
import java.util.EnumMap;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/13/22 01:26
 */
public class OrcBlacksmith implements Blacksmith {
    private static final EnumMap<WeaponType, Weapon> ORC_ARSENAL;
    
    static {
        ORC_ARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORC_ARSENAL.put(type, new OrcWeapon(type)));
    }
    
    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return ORC_ARSENAL.get(type);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
