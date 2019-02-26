package stack;

import java.util.Arrays;

public class MyStack<T> implements StackADT<T> {

	private int currentElementPos = 0;
	private static int DEFAULT_CAPACITY = 100;
	private Object[] elements;

	public MyStack() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	@Override
	public int getLength() {
		return elements.length;
	}
	
	@Override
	public int push(T elementToPush) {
		if (currentElementPos == elements.length) {
			expandSize();
		}
		elements[currentElementPos++] = elementToPush;
		return currentElementPos;
	}

	@Override
	public T pop() {
		try {
		T t = (T) elements[--currentElementPos];
		elements[currentElementPos] = null;
		return t;
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("The syntax for the operation is not valid!");
		}
		return null;
		}
	
	@Override
	public int size() {
		return currentElementPos;
	}
	
	@Override
	public boolean emptyStack() {
		if (elements == null) {
			return true;
		}
		else {
			elements = null;
			return true;
		}
	}
	
	@Override
	public void expandSize() {
		
		int increasedSize = elements.length*2;
		elements = Arrays.copyOf(elements, increasedSize);
	}
	
	public Object[] getElements() {
		return elements;
	}

}