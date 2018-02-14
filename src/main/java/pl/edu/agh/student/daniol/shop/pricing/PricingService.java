package pl.edu.agh.student.daniol.shop.pricing;

import pl.edu.agh.student.daniol.shop.utils.MathUtils;

import java.util.HashMap;
import java.util.Map;

import hadesclipse.hml.template.annotation.HmlAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttributes;
import hadesclipse.hml.template.annotation.HmlReturnAttribute;
import hadesclipse.hml.template.annotation.HmlType;
import hadesclipse.hml.template.annotation.HmlTypeValue;
import hadesclipse.hml.template.annotation.HmlTypes;


@HmlTypes(types = {
		@HmlType(id = "tpe_SaleStatus", name = "SaleStatus", base = "symbolic", values = { 
				@HmlTypeValue(is = "GOLD_SALE"),
				@HmlTypeValue(is = "SILVER_SALE"),
				@HmlTypeValue(is = "REGULAR_SALE"),
				@HmlTypeValue(is = "MONDAY_SALE"),
				@HmlTypeValue(is = "NONE")
				}),
		@HmlType(id = "tpe_SellerMood", name = "SellerMood", base = "symbolic", values = { 
				@HmlTypeValue(is = "GOOD"),
				@HmlTypeValue(is = "NORMAL")
				}),
		@HmlType(id = "tpe_CustomerStatus", name = "CustomerStatus", base = "symbolic", values = {
				@HmlTypeValue(is = "GOLD"), 
				@HmlTypeValue(is = "SILVER"),
				@HmlTypeValue(is = "NONE")
				})
		})


public class PricingService {

    private SaleStatus saleStatus;

    private static Map<SaleStatus, Float> saleDiscountMap = new HashMap<>();
    private static Map<CustomerStatus, Float> customerDiscountMap = new HashMap<>();

    static {
        customerDiscountMap.put(CustomerStatus.GOLD, 0.2f);
        customerDiscountMap.put(CustomerStatus.SILVER, 0.1f);
        customerDiscountMap.put(CustomerStatus.NONE, 0.0f);

        saleDiscountMap.put(SaleStatus.GOLD_SALE, 0.5f);
        saleDiscountMap.put(SaleStatus.MONDAY_SALE, 0.05f);
        saleDiscountMap.put(SaleStatus.SILVER_SALE, 0.35f);
        saleDiscountMap.put(SaleStatus.REGULAR_SALE, 0.2f);
        saleDiscountMap.put(SaleStatus.NONE,  0.0f);
    }


    @HmlAttribute(hml_type = "tpe_SaleStatus")
    public SaleStatus getSaleStatus() {
        return saleStatus;
    }
    @HmlAttribute(hml_type = "tpe_SaleStatus")
    public void setSaleStatus(SaleStatus saleStatus) {
        this.saleStatus = saleStatus;
    }

  
	@HmlReturnAttribute(hml_type = "tpe_CustomerStatus")
    public CustomerStatus checkStatus(int loyaltyPoints){
		
		if(loyaltyPoints<0) {
			return null;
		}
		
        if(loyaltyPoints > 1000){
            return CustomerStatus.GOLD;
        } else if (loyaltyPoints > 500){
            return CustomerStatus.SILVER;
        } else {
            return CustomerStatus.NONE;
        }
    }

    @HmlParamAttributes(attributes={@HmlParamAttribute(name="sellerMood",hml_type="tpe_SellerMood")

	})
    public float calculateDiscount(int loyaltyPoints, SellerMood sellerMood){
        CustomerStatus customerStatus = checkStatus(loyaltyPoints);
        float discount = MathUtils.pickGreater(saleDiscountMap.get(saleStatus), 
        		customerDiscountMap.get(customerStatus));

        if(SellerMood.GOOD.equals(sellerMood)){
            discount += 0.05;
        }

        return discount;
    }




}
