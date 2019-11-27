package stefan.tflc.last.task.mi.app.web.dto;

import org.springframework.data.domain.PageRequest;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PageDTO {
	
	private Integer page = 0;
    private Integer elementsCount = 100;

    public PageRequest toPageRequest(){
        return  PageRequest.of(this.page, this.elementsCount);
    }

}
