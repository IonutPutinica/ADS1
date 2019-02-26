package stack;

public interface StackADT<T> {

	public int push(T elementToPush);

	public T pop();

	public int size();

	public boolean emptyStack();

	public void expandSize();

	int getLength();

}
