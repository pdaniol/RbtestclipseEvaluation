package pl.edu.agh.student.daniol.shop.utils;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidationUtils_static_validateEmailTest_old2{
	@Test
	public void testFolded_table1(){
		//testcase
		boolean retVal;
		retVal = ValidationUtils.validateEmail("test@gmail.com");
		assertTrue(retVal == 1);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		boolean retVal;
		retVal = ValidationUtils.validateEmail("test@test@gmail.com");
		assertTrue(retVal == 0);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		boolean retVal;
		retVal = ValidationUtils.validateEmail("test.com");
		assertTrue(retVal == 0);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		boolean retVal;
		retVal = ValidationUtils.validateEmail("@gmail.com");
		assertTrue(retVal == 0);

	}

}
