package lombok;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/5/22 17:53
 */
public class BuilderDemo {
    
    public static void main(String[] args) {
        System.out.println("new " + new Demo1());
        System.out.println("new " + new Demo2());
        System.out.println("builder " + Demo1.builder().build());
        System.out.println("builder " + Demo2.builder().build());
    }
    
    @Data
    public static class Demo {
        private int id;
        private boolean sign;
        private boolean flag = false;
        private boolean remark = true;
        private Integer sex = 1;
        private Integer age;
        private Boolean mark;
        private Boolean symbol = false;
    }
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Demo1 {
        private int id;
        private boolean sign;
        private boolean flag = false;
        private boolean remark = true;
        private Integer sex = 1;
        private Integer age;
        private Boolean mark;
        private Boolean symbol = false;
        private List<Integer> list = new ArrayList<>();
    }
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Demo2 {
        private int id;
        private boolean sign;
        @Builder.Default
        private boolean flag = false;
        @Builder.Default
        private boolean remark = true;
        @Builder.Default
        private Integer sex = 1;
        private Integer age;
        private Boolean mark;
        @Builder.Default
        private Boolean symbol = false;
        @Builder.Default
        private List<Integer> list = new ArrayList<>();
    }
    
    @Data
    @Builder
    public static class Demo3 {
        private int id;
        private boolean sign;
        private boolean flag = false;
        private boolean remark = true;
        private Integer sex = 1;
        private Integer age;
        private Boolean mark;
        private Boolean symbol = false;
    }
}
