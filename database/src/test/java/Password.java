import cn.hutool.core.util.RandomUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * Description:s
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2021/7/29$ 15:00$
 */
public class Password {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String s = "abcdefghjklmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ23456789_!@#$%^&*()_+-=";
            // String s = "1hIAoHHLfJSOGPowAblGbQy9m2024hPetnT_mPmJns1N5mHhd3fi9YvxwI88AbriV9idyst3mrbzFo8CzZ4Bno1atjKUsO5dzC7IaWTRNWCZOBEeh2ePPcHRlUN4Hmutj2M4hNNqHYEnxr7kJhDKqtcmBCrPenQx6mlCeKmqZb0xEIYN3bjpZifD5f1lo2pzTjxweuPt9em9YAQWRMDPQchadznqmHWmHwdWUOlWplJy2n51K3Ax0GkagLsAGC35EOOGYcJWR1mOxgICq2pRkumBp8ryie41t7N_7oHsOR36cWpgXMlCaeYw8xW8AmI9hSCgUAR0FLDcx11ZwxEoSFD2h54fwq1iEmMGIpQWAYbj7JJ94m2OMz_2apNy3Ms5zTtS6ILDFSX6lVQqrTJfXzc5sKUbMfIaSp0fl1ocmywvV5QJONwlOtVZvTZOR3YKZnJSbneapOeqHXDWeJoMgWD8vJ35NpdqqgFS2v683WMBNKR7t25MHvzY1KEGL4bloV41ZpMKBRRtkU8oLZd8BLVWYNcQ_DVjiIvD24ARR_qFQcsLFlrx3VCcVfvHciyfX9qB57z87OIIFdjselxybe6i5Jz6Jx4zN_OURjhwrqKTODoLc2tcij8yaoayIJC6tvS_pMlbGj4B95NBC9Rujn2rTFqcCGAB8cnjLZbxar0pDL2AZxhWLtTsMQnsnLbzQKOdVobBts8YslrRIPprVvbFRblcMG2UZmgUf9FFgJQo4_cLluxAeTdG2wO1LtwJpwJj8ujn0dqUR0H85jKZhy47B2XeqrAqILD8JlmcZABfLJ51kYf4I_rriRv4r081qGhWBsr73wiILZse9d5mWbZIAVjbFedFYPGJSJOAOVNxg6dida0R4qXworwT6thRqU2KyffItjV4h8ISQuXqh2UOdv9IOsux2ViuKUixP65jCtTvZbY3wqScmDjetzYPbX_519BBOaQM9ySt2XSfoLIUCo111flIfYIHXo3kdEn9a7ZtPXez2LGGQ4vymYuS";
            int length = 20;
            List<String> collect = s.chars().mapToObj(c -> (char) c).map(String::valueOf).collect(Collectors.toList());
            // System.out.println(collect.size());

            StringBuilder sb = new StringBuilder();
            while (length-- > 0) {
                sb.append(collect.get(RandomUtil.randomInt(0, collect.size())));
            }
            System.out.println(sb);
        }
    }
}
