package pl.edu.agh.student.daniol.shop.offer.car;

import static org.junit.Assert.*;
import org.junit.Test;

public class Car_nonstatic_calculateDailyPriceTest{
	Car objCar;

	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		objCar = new Car();
		objCar.setAirConditioner(true);
		objCar.setFullInsurance(true);
		objCar.setBaseDailyPrice(100.0f);
		retVal = objCar.calculateDailyPrice();
		assertTrue(retVal == 140.0f);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		objCar = new Car();
		objCar.setAirConditioner(false);
		objCar.setFullInsurance(true);
		objCar.setBaseDailyPrice(100.0f);
		retVal = objCar.calculateDailyPrice();
		assertTrue(retVal == 120.0f);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		objCar = new Car();
		objCar.setAirConditioner(true);
		objCar.setFullInsurance(false);
		objCar.setBaseDailyPrice(100.0f);
		retVal = objCar.calculateDailyPrice();
		assertTrue(retVal == 120.0f);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		float retVal;
		objCar = new Car();
		objCar.setAirConditioner(false);
		objCar.setFullInsurance(false);
		objCar.setBaseDailyPrice(100.0f);
		retVal = objCar.calculateDailyPrice();
		assertTrue(retVal == 100.0f);

	}

}
