package stefan.tflc.last.task.mi.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stefan.tflc.last.task.mi.app.entity.DocumentItem;
import stefan.tflc.last.task.mi.app.service.DocumentItemService;
import stefan.tflc.last.task.mi.app.web.dto.DocumentItemDTO;
import stefan.tflc.last.task.mi.app.web.mapper.DocumentItemMapper;


@RestController
@RequestMapping("/api/document_items")
public class DocumentItemController extends BaseController<DocumentItemService, DocumentItemMapper, DocumentItemDTO, DocumentItem> {
	
}