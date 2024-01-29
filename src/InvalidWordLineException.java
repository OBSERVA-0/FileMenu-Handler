
public class InvalidWordLineException extends IllegalArgumentException {

	public InvalidWordLineException(String message) {
		super(message);

	}
	// exception created to detect when line is less than 1 basically no words
	// printed on document/file chosen
}
