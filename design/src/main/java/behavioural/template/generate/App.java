package behavioural.template.generate;

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
        Test t = new Test(new ImplOne());
        t.run();
        t.change(new ImplTwo());
        t.run();
    }
    
    public static class Test {
        private TemplateMethod tm;
        
        public Test(TemplateMethod tm) {
            this.tm = tm;
        }
        
        public void change(TemplateMethod tm) {
            this.tm = tm;
        }
    
        public void run() {
            tm.run();
        }
    }
}

