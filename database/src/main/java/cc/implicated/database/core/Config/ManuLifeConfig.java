package cc.implicated.database.core.Config;

import cc.implicated.database.core.enums.ManuLifeEnum;
import com.zaxxer.hikari.HikariConfig;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class ManuLifeConfig implements ConfigInterface {
    public static HikariConfig getHikariConfig(String env, String schema) {
        HikariConfig hikariConfig = new HikariConfig();
        if (ManuLifeEnum.EnvEnum.SIT.getCode().equals(env)) {
            hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");
            hikariConfig.setJdbcUrl("jdbc:oracle:thin:@129.211.67.205:1521:orcl");
            hikariConfig.setUsername("manu_life_cms");
            hikariConfig.setPassword("manu_life_cms");
        }
        return hikariConfig;
    }
}