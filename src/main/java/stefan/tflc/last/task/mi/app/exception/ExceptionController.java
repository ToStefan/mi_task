package stefan.tflc.last.task.mi.app.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleEntityNotFound(final EntityNotFoundException exception,
                                                  final HttpServletRequest request) {
        return new ExceptionResponse(exception.getMessage(), request.getRequestURI());
    }
	
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse handleException(final Exception exception,
                                             final HttpServletRequest request) {
        return new ExceptionResponse(exception.getMessage(), request.getRequestURI());
    }

}
