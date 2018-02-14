package pl.edu.agh.student.daniol.shop.offer.car;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarRentalService_static_addAgeCorrectionTest{
	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		retVal = CarRentalService.addAgeCorrection(100.0f, 29);
		assertTrue(retVal == 130.0f);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		retVal = CarRentalService.addAgeCorrection(100.0f, 30);
		assertTrue(retVal == 100.0);

		//testcase
		retVal = CarRentalService.addAgeCorrection(100.0f, 65);
		assertTrue(retVal == 100.0f);

		//testcase
		retVal = CarRentalService.addAgeCorrection(100.0f, 64);
		assertTrue(retVal == 100.0f);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		retVal = CarRentalService.addAgeCorrection(100.0f, 70);
		assertTrue(retVal == 130.0f);

	}

}
