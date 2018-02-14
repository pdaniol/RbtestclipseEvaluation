package pl.edu.agh.student.daniol.shop.offer.car;

import static org.junit.Assert.*;
import org.junit.Test;

public class CarRentalService_static_calculateRentalPriceTest{
	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateRentalPrice(8, 100.0f);
		assertTrue(retVal == 800.0f);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateRentalPrice(4, 100.0f);
		assertTrue(retVal == 440.0f);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateRentalPrice(1, 100.0f);
		assertTrue(retVal == 120.0f);

	}

}
