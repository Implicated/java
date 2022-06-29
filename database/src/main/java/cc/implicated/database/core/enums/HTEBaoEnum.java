package cc.implicated.database.core.enums;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class HTEBaoEnum {
    public final static String HT_EBAO = "ht_ebao";

    public enum EnvEnum {
        SIT("sit", "开发环境"),

        UAT("uat", "测试环境"),
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
