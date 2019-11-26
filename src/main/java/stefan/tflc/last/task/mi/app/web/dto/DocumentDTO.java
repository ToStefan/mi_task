package stefan.tflc.last.task.mi.app.web.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import stefan.tflc.last.task.mi.app.entity.DocumentItem;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DocumentDTO {

	private Long id;
	private String name;
	private Integer amount;
	public Set<DocumentItem> documentItem;

}
