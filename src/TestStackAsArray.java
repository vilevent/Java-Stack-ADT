
public class TestStackAsArray {

	public static void main(String[] args) {

		StackAsArray stackArr = new StackAsArray();
		try
		{
			stackArr.Pop();
			System.out.println("\nI am in the try block");
		}
		catch (StackIsEmptyException ex)
		{
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());
		}
		
		System.out.printf("%nCount before inserts: %d%n", stackArr.Count());
		System.out.println("\nI am past the catch block");
		stackArr.Push(11);
		stackArr.Push(21);
		stackArr.Push(-15);
		stackArr.Push(5);
		stackArr.Push(0);
		stackArr.Push(101);
		System.out.println(stackArr.ToString());
		System.out.printf("Count: %d%n%n", stackArr.Count());
		
		try 
		{
			System.out.printf("Peek the top: %d%n", stackArr.Peek());
			System.out.printf("Remove that top value: %d%n", stackArr.Pop());
			System.out.printf("Count: %d%n", stackArr.Count());
			System.out.printf("Peek the top again: %d%n", stackArr.Peek());
			System.out.printf("Remove that top value: %d%n", stackArr.Pop());
			System.out.printf("Count: %d%n%n", stackArr.Count());
		} 
		catch (StackIsEmptyException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(stackArr.ToString());
		System.out.printf("Count: %d%n", stackArr.Count());
		
		stackArr.Push(12);
		stackArr.Push(10);
		stackArr.Push(-21);
		stackArr.Push(21);
		stackArr.Push(1);
		stackArr.Push(-213);
		stackArr.Push(2100);
		System.out.println(stackArr.ToString());
		System.out.printf("Count: %d%n", stackArr.Count());	
		
		try
		{
			System.out.printf("Peek the top again: %d%n", stackArr.Peek());
		}
		catch (StackIsEmptyException ex)
		{
			ex.printStackTrace();
		}
	}

}
