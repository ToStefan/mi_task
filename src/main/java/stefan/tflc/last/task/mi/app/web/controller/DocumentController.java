package stefan.tflc.last.task.mi.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stefan.tflc.last.task.mi.app.entity.Document;
import stefan.tflc.last.task.mi.app.service.DocumentService;
import stefan.tflc.last.task.mi.app.web.dto.DocumentDTO;
import stefan.tflc.last.task.mi.app.web.mapper.DocumentMapper;

@RestController
@RequestMapping("/api/documents")
public class DocumentController extends BaseController<DocumentService, DocumentMapper, DocumentDTO, Document> {
	
}

