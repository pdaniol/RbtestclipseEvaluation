package pl.edu.agh.student.daniol.shop.offer.car;

import pl.edu.agh.student.daniol.shop.profile.Currency;

import java.util.HashMap;
import java.util.Map;

public class CarRentalService {

    private static Map<Brand, Double> carPrices = new HashMap<>();
    private static Currency currency = Currency.USD;

    static {
        carPrices.put(Brand.TESLA, 300.0);
        carPrices.put(Brand.AUDI, 50.0);
        carPrices.put(Brand.BMW, 100.0);
        carPrices.put(Brand.LAND_ROVER, 100.0);
        carPrices.put(Brand.TOYOTA, 80.0);
        carPrices.put(Brand.HONDA, 50.0);
        carPrices.put(Brand.HYUNDAI, 50.0);
        carPrices.put(Brand.VOLKSWAGEN, 40.0);
    }

    public static double calculateRentalPrice(int numOfDays, int basePrice) {
        double price = numOfDays * basePrice;
        if (numOfDays < 4) {
            price += price * 0.2;
        } else if (numOfDays < 8) {
            price += price * 0.1;
        }

        return price;

    }

    public static double addAgeCorrection(int basePrice, int age) {
        if (age < 30 || age > 65) {
            return basePrice + basePrice * 0.3;
        }

        return basePrice;
    }

    public double calculateBaseDailyPriceBasedOnBrand(Brand brand){
      return carPrices.get(brand);
    }
}
