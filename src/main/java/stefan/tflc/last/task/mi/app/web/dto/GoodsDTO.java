package stefan.tflc.last.task.mi.app.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import stefan.tflc.last.task.mi.app.entity.DocumentItem;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class GoodsDTO {

	private Long id;
	private String name;
	public DocumentItem documentItem;

}
