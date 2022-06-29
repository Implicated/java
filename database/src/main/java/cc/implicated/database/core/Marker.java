package cc.implicated.database.core;

import cc.implicated.database.core.Config.HTConfig;
import cc.implicated.database.core.Config.HTEBaoConfig;
import cc.implicated.database.core.Config.ManuLifeConfig;
import cc.implicated.database.core.Config.ArkConfig;
import cc.implicated.database.core.enums.ArkEnum;
import cc.implicated.database.core.enums.HTEBaoEnum;
import cc.implicated.database.core.enums.HTEnum;
import cc.implicated.database.core.enums.ManuLifeEnum;
import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import cn.smallbun.screw.core.process.ProcessConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;

import javax.sql.DataSource;
import java.util.ArrayList;

@Data
public class Marker {
    /**
     * 项目
     */
    private String project;
    /**
     * 文件生成路径
     */
    private String outputDir;
    /**
     * 数据库
     */
    private String schema;
    /**
     * 数据库环境
     */
    private String environment;
    /**
     * 生成文件名
     */
    private String fileName;
    /**
     * 生成文件类型
     */
    private EngineFileType fileType;
    
    /**
     * 文档生成
     */
    public void documentGeneration() {
        defaultValue();
        HikariConfig hikariConfig = getHikariConfig();
        // 设置可以获取tables remarks信息
        hikariConfig.addDataSourceProperty("useInformationSchema", "true");
        hikariConfig.setMinimumIdle(2);
        hikariConfig.setMaximumPoolSize(5);
        DataSource dataSource = new HikariDataSource(hikariConfig);
        // 生成配置
        EngineConfig engineConfig = EngineConfig.builder()
                // 生成文件路径
                .fileOutputDir(outputDir)
                // 打开目录
                .openOutputDir(false)
                // 文件类型
                .fileType(fileType)
                // 生成模板实现
                .produceType(EngineTemplateType.freemarker)
                // 自定义文件名称
                .fileName(fileName).build();
        
        // 忽略表
        ArrayList<String> ignoreTableName = new ArrayList<>();
        ignoreTableName.add("test_user");
        ignoreTableName.add("test_group");
        // 忽略表前缀
        ArrayList<String> ignorePrefix = new ArrayList<>();
        ignorePrefix.add("test_");
        // 忽略表后缀
        ArrayList<String> ignoreSuffix = new ArrayList<>();
        ignoreSuffix.add("_test");
        ProcessConfig processConfig = ProcessConfig.builder()
                // 指定生成逻辑、当存在指定表、指定表前缀、指定表后缀时，将生成指定表，其余表不生成、并跳过忽略表配置
                // 根据名称指定表生成
                .designatedTableName(new ArrayList<>())
                // 根据表前缀生成
                .designatedTablePrefix(new ArrayList<>())
                // 根据表后缀生成
                .designatedTableSuffix(new ArrayList<>())
                // 忽略表名
                .ignoreTableName(ignoreTableName)
                // 忽略表前缀
                .ignoreTablePrefix(ignorePrefix)
                // 忽略表后缀
                .ignoreTableSuffix(ignoreSuffix).build();
        // 配置
        Configuration config = Configuration.builder()
                // 版本
                .version("1.0.0")
                // 标题
                .title(fileName)
                // 描述
                .description(fileName)
                // 数据源
                .dataSource(dataSource)
                // 生成配置
                .engineConfig(engineConfig)
                // 生成配置
                .produceConfig(processConfig).build();
        // 执行生成
        new DocumentationExecute(config).execute();
    }
    
    /**
     * 设置默认值
     */
    private void defaultValue() {
        if (fileName == null || "".equals(fileName)) {
            fileName = schema.substring(4);
        }
    }
    
    /**
     * 设置schema
     */
    private HikariConfig getHikariConfig() {
        HikariConfig hikariConfig = new HikariConfig();
        if (ArkEnum.ARK.equals(project)) {
            hikariConfig = ArkConfig.getHikariConfig(environment, schema);
        }
        if (HTEnum.HT.equals(project)) {
            hikariConfig = HTConfig.getHikariConfig(environment, schema);
        }
        if (HTEBaoEnum.HT_EBAO.equals(project)) {
            hikariConfig = HTEBaoConfig.getHikariConfig(environment, schema);
        }
        if (ManuLifeEnum.MANU_LIFE.equals(project)) {
            hikariConfig = ManuLifeConfig.getHikariConfig(environment, schema);
        }
        return hikariConfig;
    }
}