import org.activiti.engine.ProcessEngine;
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
        //<editor-fold desc="代码块折叠Ctrl+Alt+T ==》 Alt+B">
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        assertNotNull(processEngine);
        //</editor-fold>
    }
}
