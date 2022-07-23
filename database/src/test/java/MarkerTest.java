import cc.implicated.database.core.Marker;
import cc.implicated.database.core.enums.ArkEnum;
import cn.smallbun.screw.core.engine.EngineFileType;
import org.junit.Test;

/**
 * <p>
 * Description:s
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2021/7/29$ 15:00$
 */
public class MarkerTest {

    final static String windowsPath = "D:\\Desktop\\ark-dev";
    final static String macPath = "/Users/z3/Desktop/ark-dev";

    @Test
    public void main() {
        System.out.println(System.getProperty("os.name"));
        Short i = 1;
        System.out.println(i == 1);
    }

    @Test
    public void export() {
        Marker marker = new Marker();
        marker.setProject(ArkEnum.ARK);
        marker.setEnvironment(ArkEnum.EnvEnum.DEV.getCode());
        marker.setSchema(ArkEnum.SchemaEnum.LMS.getCode());

        marker.setFileType(EngineFileType.HTML);
        marker.setOutputDir(System.getProperty("os.name").contains("Mac") ? macPath : windowsPath);

        marker.documentGeneration();
    }

    @Test
    public void exportList() {
        for (ArkEnum.SchemaEnum schemaEnum : ArkEnum.SchemaEnum.values()) {
            Marker marker = new Marker();
            marker.setProject(ArkEnum.ARK);
            marker.setEnvironment(ArkEnum.EnvEnum.DEV.getCode());
            marker.setSchema(schemaEnum.getCode());

            marker.setFileType(EngineFileType.HTML);
            marker.setOutputDir(macPath);

            marker.documentGeneration();
        }
    }
}
