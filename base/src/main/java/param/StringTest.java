package param;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2/22/22 12:58
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("".equals(null));
        System.out.println(StringUtils.contains("录播计算失败","计算失败"));
        System.out.println(StringUtils.contains("录播","计算失败"));
        System.out.println(StringUtils.contains("计算失败录播","计算失败"));
        System.out.println(StringUtils.contains("计算失s败录播","计算失败"));
    }
}
