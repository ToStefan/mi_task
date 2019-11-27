package stefan.tflc.last.task.mi.app.unit;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import stefan.tflc.last.task.mi.app.data.GoodsRepository;
import stefan.tflc.last.task.mi.app.entity.Goods;
import stefan.tflc.last.task.mi.app.service.GoodsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTest {
	
	@Mock
    GoodsRepository goodsRepository;
	
    @InjectMocks
    GoodsService goodsService;
	
	@Test
    public void test_findById() {
		
		Goods goods = new Goods((long)1, false, "Goods I - 100");
        doReturn(goods).when(goodsRepository).findById((long)1);
        
        assertTrue(goodsService.findOne((long)5).equals(null));
    }

}
