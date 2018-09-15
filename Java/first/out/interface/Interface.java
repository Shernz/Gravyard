//Stack operation
//Stack ADT
import java.util.*;
import java.lang.*;
class StackUnderflowError extends Exception{
    StackUnderflowError ()
    {
	super("Stack Underflow");
    }
}
interface StackOperation
{
    int size = 0;
    void pop();
    void push();
}
class Stack implements StackOperation
{
    int top = 0;
    int [] stack = new int [size];
    public void push()
    {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the number of elements to be inserted:");
	n = sc.nextInt();
	try{
	    System.out.println("Enter the numbers: ");
	    while (top < n)
	    {
		stack[top] = sc.nextInt();
		top++;
	    }
	    }
	catch(StackOverflowError e)
	{
	    System.out.println("Stack Overflow");
	}
	for (int i = 0;i < top;i++)
	{
	    System.out.print(stack[i]+" ");
	}
	System.out.println();
    }
    public void pop()
    {
	try{
	    top--;
	    if(top < 0)
	    {
		throw new StackUnderflowError ();
	    }
	}
	catch(StackUnderflowError e)
	{
	    System.out.println(e.getMessage());
	}
	for ( int i = top;i >= 0; i--)
	{
	    System.out.print(stack[i]+" ");
	}
    }
}
class Interface
{
    public static void main(String args[])
    {
	Stack s = new Stack();
	/*System.out.println("Stack push operation");
	s.push();
	System.out.println("Stack pop operation");*/
	s.pop();
    }
}


