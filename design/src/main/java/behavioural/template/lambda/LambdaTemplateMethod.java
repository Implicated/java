package behavioural.template.lambda;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:16
 */
@FunctionalInterface
public interface LambdaTemplateMethod {
    
    default void before() {
        System.out.println("lambda --> before");
    }
    
    void process();
    
    default void after() {
        System.out.println("lambda --> after");
    }
    
    default void run() {
        before();
        process();
        after();
    }
}
