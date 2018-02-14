package pl.edu.agh.student.daniol.shop.offer.phone;
import static org.junit.Assert.*;
import org.junit.Test;
import static pl.edu.agh.student.daniol.shop.profile.Country.FRANCE;
import static pl.edu.agh.student.daniol.shop.profile.Country.GERMANY;
import static pl.edu.agh.student.daniol.shop.profile.Country.NORTH_KOREA;
import static pl.edu.agh.student.daniol.shop.profile.Country.UK;
import static pl.edu.agh.student.daniol.shop.profile.Country.USA;
import static pl.edu.agh.student.daniol.shop.offer.phone.IPhoneModel.IPhoneX;
import static pl.edu.agh.student.daniol.shop.offer.phone.IPhoneModel.IPhone8;
import static pl.edu.agh.student.daniol.shop.offer.phone.IPhoneModel.IPhone6;

public class IPhone_nonstatic_isAvailableTest{
	IPhone objIPhone;

	@Test
	public void testFolded_table1(){
		//testcase
		boolean retVal;
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhoneX);
		retVal = objIPhone.isAvailable(USA);
		assertTrue(retVal == true);

	}

	@Test
	public void testFolded_table2(){
		//testcase
		boolean retVal;
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhoneX);
		retVal = objIPhone.isAvailable(FRANCE);
		assertTrue(retVal == false);

		//testcase
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhoneX);
		retVal = objIPhone.isAvailable(UK);
		assertTrue(retVal == false);

	}

	@Test
	public void testFolded_table3(){
		//testcase
		boolean retVal;
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone8);
		retVal = objIPhone.isAvailable(FRANCE);
		assertTrue(retVal == true);

		//testcase
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone6);
		retVal = objIPhone.isAvailable(FRANCE);
		assertTrue(retVal == true);

		//testcase
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone8);
		retVal = objIPhone.isAvailable(GERMANY);
		assertTrue(retVal == true);

		//testcase
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone6);
		retVal = objIPhone.isAvailable(GERMANY);
		assertTrue(retVal == true);

	}

	@Test
	public void testFolded_table4(){
		//testcase
		boolean retVal;
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone8);
		retVal = objIPhone.isAvailable(NORTH_KOREA);
		assertTrue(retVal == false);

		//testcase
		objIPhone = new IPhone();
		objIPhone.setiPhoneModel(IPhone6);
		retVal = objIPhone.isAvailable(NORTH_KOREA);
		assertTrue(retVal == false);

	}

}
