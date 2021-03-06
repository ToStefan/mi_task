package stefan.tflc.last.task.mi.app.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DocumentItemDTO extends BaseDTO {

	private Integer quantity;
	private Integer price;
	public Long goodsId;
	public Long documentId;

}
