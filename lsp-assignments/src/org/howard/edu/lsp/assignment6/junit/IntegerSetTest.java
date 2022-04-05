package org.howard.edu.lsp.assignment6.junit;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
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
	public void TestRemove() throws org.howard.edu.lsp.assignment5.implementation.IntegerSetException, IntegerSetException {
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
	@DisplayName("testRemove throws exception")
	public void testRemove_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, ()->{
			setA.remove(1);
		});
		String expectedMessage = "Can't remove from an empty set";
		String actualMessage = exception.getMessage();
		System.out.println(actualMessage);

		assertTrue(actualMessage.equals(expectedMessage));
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
	
@Test
@DisplayName("Test toString")
	public void testToString() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	
	assertEquals("[1, 2, 3, 4, 5]",setA.toString());
	assertNotEquals("12345",setA.toString());
	
}

@Test
@DisplayName("Test Union")
	public void testUnion() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.union(setB);
		System.out.println(setA.toString());
		assertEquals("[1, 2, 3, 4, 5, 7, 9]",setA.toString());
		assertNotEquals("[1,2,3,4,5,6,7,8,9]",setA.toString());
		
}
@Test
@DisplayName("Test Intersect")
	public void testIntersect() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1,3,5,7,9};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	setA.intersect(setB);
	System.out.println(setA.toString());
	assertEquals("[1, 3, 5]",setA.toString());
	assertNotEquals("[1,2,3,4,5]",setA.toString());
}
@Test
@DisplayName("Test Difference")
	public void testDifference() {
	 
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.diff(setB);
		System.out.println(setA.toString());
		assertEquals("[2, 4]",setA.toString());
		assertNotEquals("[1, 3, 5]", setA.toString());
}

@Test
@DisplayName("Test Equals")
	public void testEquals() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1,2,3,4,5};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(setA.toString(),setB.toString());
	
}

@Test
@DisplayName("Test Length")
	public void testLength() {
	
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1,2,3,4,5};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(5,setA.length());
	assertEquals(5,setB.length());
	assertEquals(setA.length(),setB.length());
}

@Test
@DisplayName("Test Largest")
	public void testLargest() throws IntegerSetException {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5,500,1000};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1,2,3,4,500,700};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(1000,setA.largest());
	assertEquals(700,setB.largest());
	}

@Test
@DisplayName("Test Largest throws exception")
public void testLargest_THROWS_EXCEPTION() {
	IntegerSet setA = new IntegerSet();
	Exception exception = assertThrows(IntegerSetException.class, ()->{
		setA.largest();
	});
	String expectedMessage = "An empty set can't have largest element!";
	String actualMessage = exception.getMessage();
	
	assertTrue(actualMessage.equals(expectedMessage));
}

@Test
@DisplayName("Test Largest")
	public void testSmallest() throws IntegerSetException {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1,2,3,4,5,500,1000};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1,2,3,4,500,700};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(1,setA.smallest());
	assertEquals(1,setB.smallest());
	}

@Test
@DisplayName("Test Largest throws exception")
public void testSmallest_THROWS_EXCEPTION() {
	IntegerSet setA = new IntegerSet();
	Exception exception = assertThrows(IntegerSetException.class, ()->{
		setA.smallest();
	});
	String expectedMessage = "An empty set can't have smallest element!";
	String actualMessage = exception.getMessage();
	
	assertTrue(actualMessage.equals(expectedMessage));
}
}




