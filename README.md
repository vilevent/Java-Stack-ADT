# Stack ADT with Java
> Programming assignment from Fall 2020 Data Structures course. Assignment description is below.

### Creating a class called `StackAsArray`
- This class will implement a LIFO data structure. The Stack will store integers and use an array to do so. 
- Your class will need to increase the size of the array as the user attempts to push integers onto the stack and there are no free indexes available. This means the Stack will need to have the appearance of being "dynamic". 

The class must implement the following:

Constructor: 

`StackAsArray()` Zero parameter. Creates a StackAsArray with capacity to hold no more than 5 items (initially).

Methods:

`void Push(int value)` Pushes value onto the StackAsArray

`int Pop( )` Removes and returns the Top of the StackAsArray

`int Peek()` Returns the Top of the StackAsArray without removing it from the Top of the Stack

`String ToString()` should return a string representation of the Stack. The output should look like a Stack (i.e., the string should contain the stack elements from
Top to Bottom)

`int Count()` Returns the number of integers currently on the StackAsArray

*Caveats: Popping an empty stack should not blow up. An exception show be generated and thrown back to the caller.*
