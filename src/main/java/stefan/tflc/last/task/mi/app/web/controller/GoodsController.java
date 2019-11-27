package stefan.tflc.last.task.mi.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stefan.tflc.last.task.mi.app.entity.Goods;
import stefan.tflc.last.task.mi.app.service.GoodsService;
import stefan.tflc.last.task.mi.app.web.dto.GoodsDTO;
import stefan.tflc.last.task.mi.app.web.mapper.GoodsMapper;

@RestController
@RequestMapping("/api/goods")
public class GoodsController extends BaseController<GoodsService, GoodsMapper, GoodsDTO, Goods> {
	
}
