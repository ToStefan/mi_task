package stefan.tflc.last.task.mi.app;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import stefan.tflc.last.task.mi.app.unit.GoodsServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	GoodsServiceTest.class
})
class MiTaskApplicationTests {

	@Test
	void contextLoads() {
	}

}
