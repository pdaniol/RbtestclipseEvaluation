package pl.edu.agh.student.daniol.shop.pricing;
import static org.junit.Assert.*;
import org.junit.Test;
import static pl.edu.agh.student.daniol.shop.pricing.SellerMood.GOOD;
import static pl.edu.agh.student.daniol.shop.pricing.SellerMood.NORMAL;
import static pl.edu.agh.student.daniol.shop.pricing.SaleStatus.GOLD_SALE;
import static pl.edu.agh.student.daniol.shop.pricing.SaleStatus.MONDAY_SALE;
import static pl.edu.agh.student.daniol.shop.pricing.SaleStatus.SILVER_SALE;
import static pl.edu.agh.student.daniol.shop.pricing.SaleStatus.REGULAR_SALE;
import static pl.edu.agh.student.daniol.shop.pricing.SaleStatus.NONE;


public class PricingService_nonstatic_calculateDiscountTest{
	PricingService objPricingService;

	@Test
	public void testFolded_table1(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(GOLD_SALE);
		retVal = objPricingService.calculateDiscount(700, GOOD);
		assertTrue(retVal == 0.55f);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(MONDAY_SALE);
		retVal = objPricingService.calculateDiscount(1200, NORMAL);
		assertTrue(retVal == 0.2f);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(REGULAR_SALE);
		retVal = objPricingService.calculateDiscount(20, NORMAL);
		assertTrue(retVal == 0.2f);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(MONDAY_SALE);
		retVal = objPricingService.calculateDiscount(20, GOOD);
		assertTrue(retVal == 0.1f);

	}

	@Test
	public void testFolded_table5(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(NONE);
		retVal = objPricingService.calculateDiscount(1200, NORMAL);
		assertTrue(retVal == 0.2f);

	}

	@Test
	public void testFolded_table6(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(NONE);
		retVal = objPricingService.calculateDiscount(0, NORMAL);
		assertTrue(retVal == 0.0f);

	}

	@Test
	public void testFolded_table7(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(REGULAR_SALE);
		retVal = objPricingService.calculateDiscount(0, GOOD);
		assertTrue(retVal == 0.25f);

	}

	@Test
	public void testFolded_table8(){
		//testcase
		float retVal;
		objPricingService = new PricingService();
		objPricingService.setSaleStatus(SILVER_SALE);
		retVal = objPricingService.calculateDiscount(1200, NORMAL);
		assertTrue(retVal == 0.35f);

	}

}
