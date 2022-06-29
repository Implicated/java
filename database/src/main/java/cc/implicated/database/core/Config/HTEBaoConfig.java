package cc.implicated.database.core.Config;

import cc.implicated.database.core.enums.HTEBaoEnum;
import com.zaxxer.hikari.HikariConfig;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class HTEBaoConfig implements ConfigInterface {
    public static HikariConfig getHikariConfig(String env, String schema) {
        HikariConfig hikariConfig = new HikariConfig();
        if (HTEBaoEnum.EnvEnum.SIT.getCode().equals(env)) {
            hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            hikariConfig.setJdbcUrl("jdbc:oracle:thin:@//10.100.242.31:1522/htl1");
            hikariConfig.setUsername("htprod");
            hikariConfig.setPassword("htprod");
        }
        if (HTEBaoEnum.EnvEnum.UAT.getCode().equals(env)) {
            hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            hikariConfig.setJdbcUrl("jdbc:oracle:thin:@//10.100.242.51:1521/htl1");
            hikariConfig.setUsername("htuat");
            hikariConfig.setPassword("htuat_255");
        }

        return hikariConfig;
    }
}