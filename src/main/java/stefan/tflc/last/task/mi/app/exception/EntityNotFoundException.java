package stefan.tflc.last.task.mi.app.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(Long id) {
		super("Entity with ID: " + id + " not found!");
	}
}