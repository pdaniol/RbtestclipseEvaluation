package pl.edu.agh.student.daniol.shop.offer.car;

import pl.edu.agh.student.daniol.shop.profile.Currency;

import java.util.HashMap;
import java.util.Map;

import hadesclipse.hml.template.annotation.HmlParamAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttributes;
import hadesclipse.hml.template.annotation.HmlType;
import hadesclipse.hml.template.annotation.HmlTypeValue;
import hadesclipse.hml.template.annotation.HmlTypes;

@HmlTypes(types = {
		@HmlType(id = "tpe_Brand", name = "Brand", base = "symbolic", values = { 
				@HmlTypeValue(is = "AUDI"),
				@HmlTypeValue(is = "BMW"),				
				@HmlTypeValue(is = "HONDA"),
				@HmlTypeValue(is = "HYUNDAI"),
				@HmlTypeValue(is = "LAND_ROVER"),
				@HmlTypeValue(is = "TESLA"),
				@HmlTypeValue(is = "TOYOTA"),
				@HmlTypeValue(is = "VOLKSWAGEN")
			
				}),
		@HmlType(id = "tpe_Currency", name = "Currency", base = "symbolic", values = {
				@HmlTypeValue(is = "EUR"), 
				@HmlTypeValue(is = "GBP"),
				@HmlTypeValue(is = "KPW"), 
				@HmlTypeValue(is = "PLN"), 
				@HmlTypeValue(is = "USD") 
				})
		})

public class CarRentalService {

    private static Map<Brand, Float> carPrices = new HashMap<>();
    private static Currency currency = Currency.USD;

    static {
        carPrices.put(Brand.TESLA, 300.0f);
        carPrices.put(Brand.AUDI, 50.0f);
        carPrices.put(Brand.BMW, 100.0f);
        carPrices.put(Brand.LAND_ROVER, 100.0f);
        carPrices.put(Brand.TOYOTA, 80.0f);
        carPrices.put(Brand.HONDA, 50.0f);
        carPrices.put(Brand.HYUNDAI, 50.0f);
        carPrices.put(Brand.VOLKSWAGEN, 40.0f);
    }

    public static float calculateRentalPrice(int numOfDays, int basePrice) {
        float price = numOfDays * basePrice;
        if (numOfDays < 4) {
            price += price * 0.2f;
        } else if (numOfDays < 8) {
            price += price * 0.1f;
        }

        return price;

    }

    public static float addAgeCorrection(int basePrice, int age) {
        if (age < 30 || age > 65) {
            return basePrice + basePrice * 0.3f;
        }

        return basePrice;
    }

    @HmlParamAttributes(attributes={@HmlParamAttribute(name="brand",hml_type="tpe_Brand")
	})
    public static float calculateBaseDailyPriceBasedOnBrand(Brand brand){
      return carPrices.get(brand);
    }
}
