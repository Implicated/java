package creational.abstractfactory;

import creational.abstractfactory.interfaces.KingdomFactory;
import creational.abstractfactory.interfaces.impl.ElfKingdomFactory;
import creational.abstractfactory.interfaces.impl.OrcishKingdomFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Supplier;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/12/22 22:00
 */
@AllArgsConstructor
@Getter
public enum KingdomType {
    ELF(ElfKingdomFactory::new),
    ORC(OrcishKingdomFactory::new),
    ;
    public Supplier<KingdomFactory> constructor;
}
