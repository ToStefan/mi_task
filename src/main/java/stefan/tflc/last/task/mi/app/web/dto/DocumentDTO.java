package stefan.tflc.last.task.mi.app.web.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DocumentDTO extends BaseDTO {

	private String name;
	public Set<DocumentItemDTO> documentItems;

}
