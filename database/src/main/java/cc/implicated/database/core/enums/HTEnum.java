package cc.implicated.database.core.enums;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class HTEnum {
    public final static String HT = "ht";

    public enum EnvEnum {
        SIT("sit", "开发环境"),

        UAT("uat", "测试环境"),

        PRE("pre", "发布环境"),

        PROD("prod", "线上环境"),
        ;

        private final String code;
        private final String name;

        EnvEnum(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }
}
