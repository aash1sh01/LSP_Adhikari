package org.howard.edu.lsp.assignment6.junit;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	@Test
	@DisplayName("Test add")
	public void TestAdd() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals("[1, 2, 3, 4, 5]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[1,2,3]", setA.toString());			
	}
	@Test
	@DisplayName("Test Remove")
	public void TestRemove() throws org.howard.edu.lsp.assignment5.implementation.IntegerSetException {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.remove(1);
		setA.remove(2);
		assertEquals("[3, 4, 5]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[1,2,3]", setA.toString());			
	}
	
@Test
@DisplayName("Test Contains")
	public void TestContains() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals(true,setA.contains(1));
		assertEquals(false,setA.contains(10));
		assertNotEquals(true,setA.contains(50));
	}
	
@Test
@DisplayName("Test isEmpty")
	public void TestEmpty() {
		IntegerSet setA= new IntegerSet();
		assertEquals(true, setA.isEmpty());
		assertNotEquals(false,setA.isEmpty());
	}
	}

