package org.howard.edu.lsp.exam.junit;
import org.howard.edu.lsp.exam.implementation.NullMapException;
import org.howard.edu.lsp.exam.implementation.MapUtilities;

import java.util.*;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class MapUtilitiesTest {
	@Test
	@DisplayName("Test empty: both maps empty")
	public void TestEmpty() throws NullMapException {
		HashMap<String, String> testMap1 = new HashMap<>();	
		HashMap<String,String> testMap2= new HashMap<>();
		assertEquals(0,MapUtilities.commonKeyValuePairs(testMap1,testMap2));
		
	}
	@Test
	@DisplayName("Test empty: 1 map empty")
	public void TestEmpty1() throws NullMapException {
		HashMap<String, String> testMap1 = new HashMap<>();	
		HashMap<String,String> testMap2= new HashMap<>();
		testMap1.put("a", "b");
		assertEquals(0,MapUtilities.commonKeyValuePairs(testMap1,testMap2));
		
	}
	
	@Test
	@DisplayName("Test Null: 1 map null")
	public void TestNull_THROWS_EXCEPTION1() throws NullMapException{
		HashMap<String, String> testMap3 = null;	
		HashMap<String,String> testMap4= new HashMap<>();
		String expectedMessage = "One or both maps are null!!";
		System.out.println(expectedMessage);

		Exception exception = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(testMap3, testMap4);
		});
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.equals(expectedMessage));
	}
	@Test
	@DisplayName("Test Null: both maps null")
	public void TestNull_THROWS_EXCEPTION2() throws NullMapException{
		HashMap<String, String> testMap3 = null;	
		HashMap<String,String> testMap4= null;
		String expectedMessage = "One or both maps are null!!";
		Exception exception = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(testMap3, testMap4);
		});
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.equals(expectedMessage));
	}

	@Test
	@DisplayName("Normal test case with same size maps")
	public void TestSameSize() throws NullMapException{
		HashMap<String, String> testMap1 = new HashMap<>();	
		HashMap<String,String> testMap2= new HashMap<>();
		testMap1.put("bob", "bat");
		testMap1.put("country", "home");
		testMap1.put("hello", "hola");
		testMap2.put("bob", "bat");
		testMap2.put("country", "home");
		testMap2.put("hello", "amigo");
		assertEquals(2,MapUtilities.commonKeyValuePairs(testMap1,testMap2));

	}
	@Test
	@DisplayName("Normal test case with different size maps")
	public void TestDifferentSize() throws NullMapException{
		HashMap<String, String> testMap1 = new HashMap<>();	
		HashMap<String,String> testMap2= new HashMap<>();
		testMap1.put("bob", "bat");
		testMap1.put("country", "home");
		testMap1.put("hello", "hola");
		testMap1.put("blanket", "christmas");
		testMap1.put("hormones", "biology");

		testMap2.put("bob", "bat");
		testMap2.put("country", "home");
		testMap2.put("hello", "amigo");
		testMap2.put("hormones", "biology");
		assertEquals(3,MapUtilities.commonKeyValuePairs(testMap1,testMap2));
		assertNotEquals(2,MapUtilities.commonKeyValuePairs(testMap1, testMap2));

	}
}
