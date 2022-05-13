package behavioural.template.lambda;


/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:02
 */
public abstract class AbstractOne implements LambdaTemplateMethod {
    @Override
    public void before() {
        System.out.println(getClass().getSimpleName() + "  --> before....");
    }
    
    @Override
    public void after() {
        System.out.println(getClass().getSimpleName() + "  --> after....");
    }
}
