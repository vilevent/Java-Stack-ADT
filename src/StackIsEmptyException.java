
@SuppressWarnings("serial")
public class StackIsEmptyException extends Exception {

	public StackIsEmptyException() 
	{
		
	}

	public StackIsEmptyException(String message) 
	{
		super(message);
	}

	public StackIsEmptyException(Throwable cause) 
	{
		super(cause);
	}

	public StackIsEmptyException(String message, Throwable cause) 
	{
		super(message, cause);
	}

}
