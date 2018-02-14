package pl.edu.agh.student.daniol.shop.pricing;
import static org.junit.Assert.*;
import org.junit.Test;
import static pl.edu.agh.student.daniol.shop.pricing.CustomerStatus.GOLD;
import static pl.edu.agh.student.daniol.shop.pricing.CustomerStatus.NONE;
import static pl.edu.agh.student.daniol.shop.pricing.CustomerStatus.SILVER;;


public class PricingService_nonstatic_checkStatusTest{
	PricingService objPricingService;

	@Test
	public void testFolded_table1(){
		//testcase
		CustomerStatus retVal;
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(0);
		assertTrue(retVal == NONE);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(500);
		assertTrue(retVal == NONE);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(433);
		assertTrue(retVal == NONE);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		CustomerStatus retVal;
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(501);
		assertTrue(retVal == SILVER);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(1000);
		assertTrue(retVal == SILVER);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(808);
		assertTrue(retVal == SILVER);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		CustomerStatus retVal;
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(1001);
		assertTrue(retVal == GOLD);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(546372584);
		assertTrue(retVal == GOLD);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		CustomerStatus retVal;
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(-1);
		assertTrue(retVal == null);

		//testcase
		objPricingService = new PricingService();
		retVal = objPricingService.checkStatus(-1394810457);
		assertTrue(retVal == null);

	}

}
