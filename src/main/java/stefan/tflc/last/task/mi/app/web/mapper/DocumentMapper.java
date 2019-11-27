package stefan.tflc.last.task.mi.app.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import stefan.tflc.last.task.mi.app.entity.Document;
import stefan.tflc.last.task.mi.app.web.dto.DocumentDTO;

@Component
public class DocumentMapper implements BaseMapper<Document, DocumentDTO> {
	
	@Autowired
	DocumentItemMapper documentItemMapper;

	@Override
	public Document toEntity(DocumentDTO dto) {
		Document entity = new Document();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDocumentItems(documentItemMapper.toEntity(dto.getDocumentItems()));
		return entity;
	}

	@Override
	public DocumentDTO toDto(Document entity) {
		DocumentDTO dto = new DocumentDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDocumentItems(documentItemMapper.toDto(entity.getDocumentItems()));
		return dto;
	}

}