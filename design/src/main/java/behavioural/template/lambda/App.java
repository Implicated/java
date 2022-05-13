package behavioural.template.lambda;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/28/22 15:07
 */
public class App {
    public static void main(String[] args) {
        Test t = new Test(() -> System.out.println("where is this?"));
        t.run();
        t.change(() -> System.out.println("where is this?"));
        t.run();
    }
    
    public static class Test {
        private LambdaTemplateMethod tm;
        
        public Test(LambdaTemplateMethod tm) {
            this.tm = tm;
        }
        
        public void change(LambdaTemplateMethod tm) {
            this.tm = tm;
        }
        
        public void run() {
            tm.run();
        }
    }
}

