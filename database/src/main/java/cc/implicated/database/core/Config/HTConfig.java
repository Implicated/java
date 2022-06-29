package cc.implicated.database.core.Config;

import cc.implicated.database.core.enums.HTEnum;
import com.zaxxer.hikari.HikariConfig;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class HTConfig implements ConfigInterface {
    public static HikariConfig getHikariConfig(String env, String schema) {
        HikariConfig hikariConfig = new HikariConfig();
        if (HTEnum.EnvEnum.SIT.getCode().equals(env)) {
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mysql://10.100.242.81:3306/sit_htlife");
            hikariConfig.setUsername("sit_htlife");
            hikariConfig.setPassword("sit_htlife@81");
        }
        if (HTEnum.EnvEnum.UAT.getCode().equals(env)) {
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mysql://10.100.242.81:3306/uat_htlife");
            hikariConfig.setUsername("uat_htlife");
            hikariConfig.setPassword("uat_htlife@81");
        }
        if (HTEnum.EnvEnum.PROD.getCode().equals(env)) {
            hikariConfig.setDriverClassName("org.mariadb.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mariadb://10.100.31.32:3306/htlife");
            hikariConfig.setUsername("htlife_dev");
            hikariConfig.setPassword("htlife_dev");
        }
        
        return hikariConfig;
    }
}