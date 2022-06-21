package a.extend;

import org.junit.Test;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/25/22 20:04
 */
public class ExtendApp {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p);
    }
    
    @Test
    public void field() {
        Parent p = new Parent();
        System.out.println(p.getName());
        System.out.println(p.getNick());
        System.out.println(p.nick);
        System.out.println("---------------");
        
        Children c = new Children();
        System.out.println(c.getName());
        System.out.println(((Parent) c).getName());
        System.out.println(c.getNick());
        System.out.println(((Parent) c).getNick());
        // print parent
        System.out.println(((Parent) c).nick);
        System.out.println("---------------");
        
        Parent pc = new Children();
        System.out.println(pc.getName());
        System.out.println(pc.getNick());
        
    }
}
