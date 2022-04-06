package creational.factorymethod.interfaces.impl;

import creational.factorymethod.WeaponType;
import creational.factorymethod.interfaces.Weapon;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/13/22 09:43
 */
@AllArgsConstructor
@Getter
public class ElfWeapon implements Weapon {
    private WeaponType weaponType;
    
    @Override
    public String toString() {
        return "elf " + weaponType;
    }
}
