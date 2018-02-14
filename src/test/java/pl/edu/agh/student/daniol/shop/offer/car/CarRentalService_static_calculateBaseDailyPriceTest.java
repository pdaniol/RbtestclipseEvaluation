package pl.edu.agh.student.daniol.shop.offer.car;

import static org.junit.Assert.*;
import org.junit.Test;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.AUDI;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.TESLA;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.BMW;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.LAND_ROVER;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.TOYOTA;
import static pl.edu.agh.student.daniol.shop.offer.car.Brand.VOLKSWAGEN;


public class CarRentalService_static_calculateBaseDailyPriceTest{
	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateBaseDailyPrice(TESLA);
		assertTrue(retVal == 300.0);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateBaseDailyPrice(BMW);
		assertTrue(retVal == 100.0);

		//testcase
		retVal = CarRentalService.calculateBaseDailyPrice(LAND_ROVER);
		assertTrue(retVal == 100.0);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateBaseDailyPrice(TOYOTA);
		assertTrue(retVal == 80.0);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		float retVal;
		retVal = CarRentalService.calculateBaseDailyPrice(AUDI);
		assertTrue(retVal == 50.0);

		//testcase
		retVal = CarRentalService.calculateBaseDailyPrice(VOLKSWAGEN);
		assertTrue(retVal == 50.0);

	}

}
