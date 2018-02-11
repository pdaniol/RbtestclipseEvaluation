package pl.edu.agh.student.daniol.shop.pricing;

import pl.edu.agh.student.daniol.shop.profile.Country;
import pl.edu.agh.student.daniol.shop.profile.Currency;

import java.util.HashMap;
import java.util.Map;

import static pl.edu.agh.student.daniol.shop.profile.Country.*;
import static pl.edu.agh.student.daniol.shop.profile.Currency.*;

public class ExchangeService {

    private static Map<Currency, Map<Currency, Double>>  exchangeMap = new HashMap<>();
    private static Map<Country, Currency>  currencyMap = new HashMap<>();

    static {

        currencyMap.put(POLAND, PLN);
        currencyMap.put(UK, GBP);
        currencyMap.put(GERMANY, EUR);
        currencyMap.put(GREECE, EUR);
        currencyMap.put(FRANCE, EUR);
        currencyMap.put(USA, USD);
        currencyMap.put(NORTH_KOREA, KPW);


        Map<Currency, Double> usdMap = new HashMap<>();
        usdMap.put(PLN, 3.42);
        usdMap.put(GBP, 0.72);
        usdMap.put(EUR, 0.82);
        usdMap.put(KPW, 899.60);

        Map<Currency, Double> eurMap = new HashMap<>();
        eurMap.put(PLN, 4.19);
        eurMap.put(GBP, 0.89);
        eurMap.put(USD, 1.23);
        eurMap.put(KPW, 1102.31);

        Map<Currency, Double> gbpMap = new HashMap<>();
        gbpMap.put(PLN, 4.73);
        gbpMap.put(EUR, 1.13);
        gbpMap.put(USD, 1.39);
        gbpMap.put(KPW, 1243.92);

        Map<Currency, Double> plnMap = new HashMap<>();
        plnMap.put(GBP, 0.22);
        plnMap.put(EUR, 0.24);
        plnMap.put(USD, 0.30);
        plnMap.put(KPW, 262.70);

        Map<Currency, Double> kpwMap = new HashMap<>();
        kpwMap.put(GBP, 0.0008);
        kpwMap.put(EUR, 0.0009);
        kpwMap.put(USD, 0.0011);
        kpwMap.put(PLN, 0.0038);

        exchangeMap.put(USD, usdMap);
        exchangeMap.put(PLN, plnMap);
        exchangeMap.put(EUR, eurMap);
        exchangeMap.put(GBP, gbpMap);
        exchangeMap.put(KPW, kpwMap);
    }

    public static Currency getCurrencyBasedOnCountry(Country country){
        return currencyMap.get(country);
    }


    public static double calculatePrice(double basePrice, Currency baseCurrency, Currency exchangeCurrency){
        return basePrice * exchangeMap.get(baseCurrency).get(exchangeCurrency);
    }


}
