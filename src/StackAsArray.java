/* 
 * 
 * Description: This is a StackAsArray class that
 * implements a LIFO data structure. The Stack will
 * store integers and use an array to store the integers.
 * 
 */
public class StackAsArray {
	
	private int[] Stack;
	private int top;
	private int capacity;
	
	/* Description: this constructor creates a StackAsArray
	 * with capacity to hold no more than 5 items (initially).
	 */
	public StackAsArray()
	{
		this.top = -1; /* -1 means the Stack is initially empty */
		this.capacity = 5;
		this.Stack = new int[this.capacity];
	}
	
	/* Description: method Count returns the number of
	 * integers currently on the StackAsArray.
	 */
	public int Count()
	{
		return this.top + 1;
	}
	
	
	/* Description: method Push will push the  
	 * parameter value onto the StackAsArray.
	 */
	public void Push(int value)
	{
		this.top = this.top + 1;
		
		if(IsFull())
		{
			ExpandStack();
		}
		this.Stack[this.top] = value;
	}
	
	/* Description: if IsFull returns true, method ExpandStack will 
	 * be called to expand StackAsArray's capacity by increasing the
	 * size of the array so that the user can continue to push integers
	 * onto the Stack.
	 */
	private void ExpandStack()
	{
		int[] tempStack = new int[this.capacity * 2];
		
		for(int index = 0; index < this.top; index++)
		{
			tempStack[index] = this.Stack[index];
		}
		this.capacity = this.capacity * 2;
		this.Stack = tempStack;
	}
	
	/* Description: method Pop removes and returns
	 * the integer at the top of the StackAsArray.
	 */
	public int Pop() throws StackIsEmptyException
	{	
		int poppedValue = Peek();
		--this.top;
		
		return poppedValue;
	}
	
	/* Description: method Peek returns the integer at the top
	 * of the StackAsArray without removing it from the top of
	 * the Stack.
	 */
	public int Peek() throws StackIsEmptyException
	{
		/* call IsEmpty() to see if Stack is empty and throw exception if needed */
		if(IsEmpty())
		{
			throw new StackIsEmptyException("The Stack is currently empty.");
		}
		
		return this.Stack[this.top];
	}
	
	/* Description: method ToString returns a string
	 * representation of the Stack, in which the string
	 * contains the Stack elements from top to bottom.
	 */
	public String ToString()
	{
		String printedStack = "\n";
		
		for(int index = this.top; index >= 0; index--)
		{
			printedStack += this.Stack[index] + "\n";
		}
		
		return printedStack;
	}
	
	/* Description: method IsFull returns true if the
	 * StackAsArray is full, or returns false if the
	 * StackAsArray is not full.
	 */
	private boolean IsFull()
	{
		boolean flag = false;
		
		if(this.top == this.capacity)
		{
			flag = true;
		}
		return flag;
	}
	
	/* Description: method IsEmpty returns true if the
	 * StackAsArray is empty, or returns false if the
	 * StackAsArray is not empty.
	 */
	private boolean IsEmpty()
	{
		boolean flag = false;
		
		if(this.top == -1)
		{
			flag = true;
		}
		return flag;
	}

}
