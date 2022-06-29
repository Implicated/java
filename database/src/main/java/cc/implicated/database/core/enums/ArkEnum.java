package cc.implicated.database.core.enums;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyu
 * @since 2021-04-02
 */
public class ArkEnum {
    public final static String ARK = "ark";
    
    public enum EnvEnum {
        DEV("dev", "开发环境"),
        
        TEST("test", "测试环境"),
        
        RELEASE("release", "发布环境"),
        
        PRE("pre", "线上环境"),
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
    
    /*
     * select concat(upper(SCHEMA_NAME),'("',SCHEMA_NAME,'",""),') from information_schema.SCHEMATA a;
     */
    public enum SchemaEnum {
        // YOUNG("ark-young", ""),
        ACADEMY("ark_academy", "择校小程序"),
        ACTIVITI("ark_activiti", "工作流"),
        ATHENA("ark_athena", "雅典娜"),
        COLLEGE("ark_college", "院校"),
        CRM("ark_crm", "销售"),
        DISTRIBUTION("ark_distribution", "分销商"),
        EDUCATION("ark_education", "答疑"),
        FINANCE("ark_finance", "财务"),
        GROWTH("ark_growth", "增长"),
        HOME_WORK("ark_homework", "作业"),
        LOGISTICS("ark_logistics", "物料"),
        LMS("ark_lms", "学管"),
        MESSAGE("ark_message", "消息"),
        OPERATION("ark_operation", "运营"),
        ORDER("ark_order", "订单"),
        PAY("ark_pay", "支付"),
        PRODUCT("ark_product", "产品"),
        PROMOTION("ark_promotion", "促销"),
        QUESTION("ark_question", "政治小程序"),
        QUESTION_APPLETS("ark_question_applets", "刷题小程序"),
        REF("ark_ref", "ref"),
        STATISTICS("ark_statistics", "数据中心"),
        SYNC_USER("ark_sync_user", "用户同步"),
        TEACHER("ark_teacher", "教师"),
        TOOL("ark_tool", "活码"),
        USER("ark_user", "用户"),
        WORD("ark_word", "单词小程序"),
        XXL_JOB("ark_xxl_job", "定时任务"),
        ;
        
        private final String code;
        private final String name;
        
        SchemaEnum(String code, String name) {
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
