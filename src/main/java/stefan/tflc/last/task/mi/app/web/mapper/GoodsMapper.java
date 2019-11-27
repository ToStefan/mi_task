package stefan.tflc.last.task.mi.app.web.mapper;

import org.springframework.stereotype.Component;

import stefan.tflc.last.task.mi.app.entity.Goods;
import stefan.tflc.last.task.mi.app.web.dto.GoodsDTO;

@Component
public class GoodsMapper implements BaseMapper<Goods, GoodsDTO> {

	@Override
	public Goods toEntity(GoodsDTO dto) {
		Goods entity = new Goods();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	@Override
	public GoodsDTO toDto(Goods entity) {
		GoodsDTO dto = new GoodsDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

}
