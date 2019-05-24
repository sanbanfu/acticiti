import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

//静态导入

/**
 * 与流程引擎相关的测试
 * Created by huguanghgui on 2019/5/24.
 */
public class ProcessEngineTest {
    /**
     * 通过ProcessEngines获取流程引擎
     */
    @Test
    public void testGetProcessEngineByProcessEngines() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        assertNotNull(processEngine);
    }

    /**
     * 通过代码配置Configuration获取流程引擎
     *
     */
    @Test
    public void testGetProcessEngineByDemoConfiguration() {
        //<editor-fold desc="IDEA代码块折叠Ctrl+Alt+T ==》 Alt+B">
        ProcessEngine processEngine = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration()
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)
                .setJdbcUrl("jdbc:h2:mem:my-own-db;DB_CLOSE_DELAY=1000")
                .buildProcessEngine();
        //</editor-fold>
        assertNotNull(processEngine);
    }
}
