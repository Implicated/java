package behavioural.template.generate;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:01
 */
public abstract class TemplateMethod {
    protected abstract void before();
    
    protected void process() {
        System.out.println( "TemplateMethod  --> process....");
    }
    
    protected abstract void after();
    
    public void run() {
        before();
        process();
        after();
    }
}
