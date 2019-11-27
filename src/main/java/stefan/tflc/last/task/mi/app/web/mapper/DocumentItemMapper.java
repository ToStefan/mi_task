package stefan.tflc.last.task.mi.app.web.mapper;

import org.springframework.stereotype.Component;

import stefan.tflc.last.task.mi.app.entity.Document;
import stefan.tflc.last.task.mi.app.entity.DocumentItem;
import stefan.tflc.last.task.mi.app.entity.Goods;
import stefan.tflc.last.task.mi.app.web.dto.DocumentItemDTO;

@Component
public class DocumentItemMapper implements BaseMapper<DocumentItem, DocumentItemDTO> {

	@Override
	public DocumentItem toEntity(DocumentItemDTO dto) {
		DocumentItem entity = new DocumentItem();
		entity.setId(dto.getId());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());

		
		Document document = new Document();
		document.setId(dto.getDocumentId());
		entity.setDocument(document);
		
		Goods goodsEntity = new Goods();
		goodsEntity.setId(dto.getGoodsId());
		entity.setGoods(goodsEntity);

		return entity;
	}

	@Override
	public DocumentItemDTO toDto(DocumentItem entity) {
		DocumentItemDTO dto = new DocumentItemDTO();
		dto.setId(entity.getId());
		dto.setPrice(entity.getPrice());
		dto.setQuantity(entity.getQuantity());
		dto.setGoodsId(entity.getGoods().getId());
		return dto;
	}

}