package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import stack.MyStack;

public class MyStackTest {

	// Test for getting the size of the stack.
	@Test
	public void testStackSize() {
		MyStack<String> myStack = new MyStack<String>();
		System.out.println("Initial capacity:" + myStack.size());
		myStack.push("Something1");
		myStack.push("Something2");
		System.out.println("After pushing twice:" + myStack.size());
		myStack.pop();
		System.out.println("Poping the stack:" + myStack.size());
		assertEquals(1, myStack.size());
	}

	// Test for pushing onto the stack.
	@Test
	public void testStackPush() {
		MyStack<String> myStack = new MyStack<String>();
		myStack.push("Test2");
		assertEquals("Test2", myStack.pop());
	}

	// Test for popping onto the stack
	@Test
	public void testStackPop() {
		MyStack<String> myStack = new MyStack<String>();
		myStack.push("AAA");
		myStack.push("AAB");
		myStack.push("ABB");
		myStack.push("BBB");
		myStack.pop();
		assertEquals(3, myStack.size());
	}

	// Test if the stack is empty.
	@Test
	public void testEmptyStack() {
		MyStack<String> myStack = new MyStack<String>();
		assertTrue(myStack.emptyStack());
	}

	// Test for comparing the initial and expanded array size.
	@Test
	public void testExpandSize() {
		MyStack<String> myStack = new MyStack<String>();
		Object[] myElements = myStack.getElements();
		myStack.expandSize();
		assertNotEquals(myElements, myStack.getElements());
	}

	// Test for getting an instance of elements.
	@Test
	public void testGetElements() {
		MyStack<String> myStack = new MyStack<String>();
		assertEquals(100, myStack.getElements().length);
	}
}