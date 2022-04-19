package bean;

import cn.hutool.core.bean.BeanUtil;
import org.junit.Test;
import pojo.User;
import pojo.UserCopy;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/17/22 14:42
 */
public class BeanUtilDemo {
    @Test
    public void copy() {
        User user = User.getOne(1, 1);
        UserCopy userCopy = new UserCopy();
        BeanUtil.copyProperties(user, userCopy);
        System.out.println(userCopy);
    }
}

