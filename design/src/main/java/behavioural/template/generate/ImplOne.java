package behavioural.template.generate;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:02
 */
public class ImplOne extends TemplateMethod{
    @Override
    protected void before() {
        System.out.println(getClass().getSimpleName() + "  --> before....");
    }
    
    @Override
    protected void process() {
        System.out.println(getClass().getSimpleName() + "  --> process....");
    }
    
    @Override
    protected void after() {
        System.out.println(getClass().getSimpleName() + "  --> after....");
    }
}
