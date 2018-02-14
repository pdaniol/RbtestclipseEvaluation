package pl.edu.agh.student.daniol.shop.pricing;
import static org.junit.Assert.*;
import org.junit.Test;

import static pl.edu.agh.student.daniol.shop.profile.Currency.EUR;
import static pl.edu.agh.student.daniol.shop.profile.Currency.GBP;
import static pl.edu.agh.student.daniol.shop.profile.Currency.KPW;
import static pl.edu.agh.student.daniol.shop.profile.Currency.PLN;
import static pl.edu.agh.student.daniol.shop.profile.Currency.USD;

public class ExchangeService_static_calculatePriceTest{
	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		retVal = ExchangeService.calculatePrice(10.0f, PLN, USD);
		System.out.println(retVal);
		assertTrue(retVal == 3.0f);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		retVal = ExchangeService.calculatePrice(10.0f, KPW, PLN);
		System.out.println(retVal);
		assertTrue(retVal == 0.04f);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		retVal = ExchangeService.calculatePrice(10.0f, EUR, GBP);
		assertTrue(retVal == 8.9f);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		float retVal;
		retVal = ExchangeService.calculatePrice(10.0f, GBP, KPW);
		assertTrue(retVal == 12439.2f);

	}

	@Test
	public void testFolded_table5(){
		//testcase
		float retVal;
		retVal = ExchangeService.calculatePrice(10.0f, USD, EUR);
		assertTrue(retVal == 8.2f);

	}

}
