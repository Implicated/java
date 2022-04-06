package creational.abstractfactory.interfaces.impl;

import creational.abstractfactory.interfaces.King;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 21:03
 */
public class ElfKing implements King {
    @Override
    public String getDescription() {
        return getClass().getSimpleName();
    }
}
