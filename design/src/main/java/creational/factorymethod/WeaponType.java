package creational.factorymethod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/13/22 01:23
 */
@RequiredArgsConstructor
@Getter
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");
    
    private final String title;
}
