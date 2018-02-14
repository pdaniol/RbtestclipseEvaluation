package pl.edu.agh.student.daniol.shop.pricing;
import static org.junit.Assert.*;
import static pl.edu.agh.student.daniol.shop.profile.Country.FRANCE;
import static pl.edu.agh.student.daniol.shop.profile.Country.GERMANY;
import static pl.edu.agh.student.daniol.shop.profile.Country.NORTH_KOREA;
import static pl.edu.agh.student.daniol.shop.profile.Country.POLAND;
import static pl.edu.agh.student.daniol.shop.profile.Country.UK;
import static pl.edu.agh.student.daniol.shop.profile.Country.USA;
import static pl.edu.agh.student.daniol.shop.profile.Currency.EUR;
import static pl.edu.agh.student.daniol.shop.profile.Currency.GBP;
import static pl.edu.agh.student.daniol.shop.profile.Currency.KPW;
import static pl.edu.agh.student.daniol.shop.profile.Currency.PLN;
import static pl.edu.agh.student.daniol.shop.profile.Currency.USD;

import org.junit.Test;

import pl.edu.agh.student.daniol.shop.profile.Currency;

public class ExchangeService_static_findCurrencyTest{
	@Test
	public void testFolded_table1(){
		//testcase
		Currency retVal;
		retVal = ExchangeService.findCurrency(FRANCE);
		assertTrue(retVal == EUR);

		//testcase
		retVal = ExchangeService.findCurrency(GERMANY);
		assertTrue(retVal == EUR);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		Currency retVal;
		retVal = ExchangeService.findCurrency(NORTH_KOREA);
		assertTrue(retVal == KPW);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		Currency retVal;
		retVal = ExchangeService.findCurrency(POLAND);
		assertTrue(retVal == PLN);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		Currency retVal;
		retVal = ExchangeService.findCurrency(UK);
		assertTrue(retVal == GBP);

	}

	@Test
	public void testFolded_table5(){
		//testcase
		Currency retVal;
		retVal = ExchangeService.findCurrency(USA);
		assertTrue(retVal == USD);

	}

}
