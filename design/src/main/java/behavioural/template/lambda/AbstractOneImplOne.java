package behavioural.template.lambda;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:32
 */
public class AbstractOneImplOne extends AbstractOne {
    @Override
    public void process() {
        System.out.println(getClass().getSimpleName() + "process");
    }
}
