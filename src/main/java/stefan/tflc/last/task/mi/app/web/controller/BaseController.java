package stefan.tflc.last.task.mi.app.web.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import stefan.tflc.last.task.mi.app.entity.AbstractModel;
import stefan.tflc.last.task.mi.app.service.BaseService;
import stefan.tflc.last.task.mi.app.web.dto.BaseDTO;
import stefan.tflc.last.task.mi.app.web.dto.PageDTO;
import stefan.tflc.last.task.mi.app.web.mapper.BaseMapper;

@SuppressWarnings("rawtypes")
public abstract class BaseController<S extends BaseService, M extends BaseMapper, DTO extends BaseDTO, E extends AbstractModel> {

	@Autowired
	S service;

	@Autowired
	M mapper;

	@SuppressWarnings("unchecked")
	@PostMapping("/pages/{page}/{elementsCount}")
	public ResponseEntity<Set<DTO>> findAll(@PathVariable Integer page, @PathVariable Integer elementsCount) {
		PageDTO pageDto = new PageDTO(page, elementsCount);
		List<E> entities = service.findAll(pageDto).getContent();
		return ResponseEntity.ok().body(mapper.toDto(entities));
	}

	@SuppressWarnings({ "unchecked" })
	@GetMapping("/{id}")
	public ResponseEntity findOne(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toDto(service.findOne(id)));
	}

	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity create(@RequestBody DTO dto) {
		if (dto.getId() != 0) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toDto(service.save(mapper.toEntity(dto))));
	}

	@SuppressWarnings("unchecked")
	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable Long id, @RequestBody DTO dto) {
		if (id != dto.getId()) {
			return ResponseEntity.badRequest().build();
		}
		E entity = (E) service.save(mapper.toEntity(dto));
		return ResponseEntity.ok(mapper.toDto(entity));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteOne(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
