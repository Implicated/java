package cc.implicated.database.core.Config;

import cc.implicated.database.core.enums.ArkEnum;
import com.zaxxer.hikari.HikariConfig;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class ArkConfig implements ConfigInterface {
    public static HikariConfig getHikariConfig(String env, String schema) {
        HikariConfig hikariConfig = new HikariConfig();
        if (ArkEnum.EnvEnum.DEV.getCode().equals(env)) {
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mysql://192.168.100.212:13306/" + schema);
            hikariConfig.setUsername("ark-dev");
            hikariConfig.setPassword("ark2rfv#TGB");
        }
        if (ArkEnum.EnvEnum.TEST.getCode().equals(env)) {
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mysql://192.168.100.212:23306/" + schema);
            hikariConfig.setUsername("ark-test");
            hikariConfig.setPassword("ark!@#$qwer");
        }
        return hikariConfig;
    }
}