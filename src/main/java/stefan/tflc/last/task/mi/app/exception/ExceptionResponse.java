package stefan.tflc.last.task.mi.app.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {

    private String errorMessage;
    private String requestedURI;
}
