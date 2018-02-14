package pl.edu.agh.student.daniol.shop.utils;
/* insert package here */
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidationUtils_static_validateEmailTest_old1{
	@Test
	public void testFolded_table1(){
		//testcase
		tpe_boolean_type retVal;
		retVal = ValidationUtils.validateEmail("test@gmail.com");
		assertTrue(retVal == true);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		tpe_boolean_type retVal;
		retVal = ValidationUtils.validateEmail("test@test@gmail.com");
		assertTrue(retVal == false);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		tpe_boolean_type retVal;
		retVal = ValidationUtils.validateEmail("test.com");
		assertTrue(retVal == false);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		tpe_boolean_type retVal;
		retVal = ValidationUtils.validateEmail("@gmail.com");
		assertTrue(retVal == false);

	}

}
