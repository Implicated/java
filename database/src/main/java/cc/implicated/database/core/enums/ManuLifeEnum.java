package cc.implicated.database.core.enums;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class ManuLifeEnum {
    public final static String MANU_LIFE = "manu_life";

    public enum EnvEnum {
        SIT("dev", "开发环境"),
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
