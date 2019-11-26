package stefan.tflc.last.task.mi.app.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import stefan.tflc.last.task.mi.app.entity.Document;
import stefan.tflc.last.task.mi.app.entity.Goods;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DocumentItemDTO {

	private Long id;
	private Integer quantity;
	private Integer price;
	public Goods goods;
	public Document document;

}
