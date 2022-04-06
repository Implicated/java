package creational.factorymethod.interfaces.impl;

import creational.factorymethod.WeaponType;
import creational.factorymethod.interfaces.Weapon;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/13/22 09:43
 */
@RequiredArgsConstructor
@Getter
public class OrcWeapon implements Weapon {
    private final WeaponType weaponType;
    
    @Override
    public String toString() {
        return "orc " + weaponType;
    }
}
