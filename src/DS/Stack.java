import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	// declaring private vars , because we dont want other classes 
	// manipulating with it.
	private int arr[];
	private int size;
	private int index = 0;

	public Stack( int size ) {
		this.size = size;
		arr = new int[size];
	}

	// pushing new elements.
	public void push(int element) {

		if( isFull() ) {
			throw new StackOverflowError("The stack is full.");
		}

		arr[index] = element;
		index++;
	}

	// popping elemetns.
	public int pop() {
		if ( isEmpty() ) {
			throw new EmptyStackException();
		}

		return arr[ --index ];
	}

	public int size() {
		return index;
	}

	public boolean isEmpty() {
		// if index is == 0 , then  stack is empty.
		if ( index == 0 ) {
			return true;
		}

		return false;
	}

	public boolean isFull() {
		// if index == size , then stack is full.
		if ( index == size ) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// Stack - A linear data structure based on the last in first
		// first out principle, i.e. whatever element comes in last
		// is taken out first. So, if there are 3 elements in the 
		// stack, you cannot access the first element , until you 
		// deleted the last element, because , we can perform only 3
		// operations on the stack, push, read and delete.

		Stack stack = new Stack(5);

		System.out.println("Size of Stack before pushing - " + stack.size());

		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println("Size of stack after pushing - " + stack.size());

		System.out.println(" Pushing elements out of the stack. ");
		while( !stack.isEmpty() ) {
			System.out.print("Element removed - " + stack.pop());
		}

		System.out.println();

		System.out.println(" Size of stack after popping - " + stack.size());
	}
}
