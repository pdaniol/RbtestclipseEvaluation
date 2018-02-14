package pl.edu.agh.student.daniol.shop.pricing;

import pl.edu.agh.student.daniol.shop.profile.Country;
import pl.edu.agh.student.daniol.shop.profile.Currency;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static pl.edu.agh.student.daniol.shop.profile.Country.*;
import static pl.edu.agh.student.daniol.shop.profile.Currency.*;

import hadesclipse.hml.template.annotation.HmlParamAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttributes;
import hadesclipse.hml.template.annotation.HmlReturnAttribute;
import hadesclipse.hml.template.annotation.HmlType;
import hadesclipse.hml.template.annotation.HmlTypeValue;
import hadesclipse.hml.template.annotation.HmlTypes;

@HmlTypes(types = {
		@HmlType(id = "tpe_Country", name = "Country", base = "symbolic", values = { 
				@HmlTypeValue(is = "FRANCE"),
				@HmlTypeValue(is = "GERMANY"),
				@HmlTypeValue(is = "GREECE"),
				@HmlTypeValue(is = "NORTH_KOREA"),
				@HmlTypeValue(is = "POLAND"),
				@HmlTypeValue(is = "UK"),
				@HmlTypeValue(is = "USA")
				}),
		@HmlType(id = "tpe_Currency", name = "Currency", base = "symbolic", values = {
				@HmlTypeValue(is = "EUR"), 
				@HmlTypeValue(is = "GBP"),
				@HmlTypeValue(is = "KPW"), 
				@HmlTypeValue(is = "PLN"), 
				@HmlTypeValue(is = "USD") 
				})
		})

public class ExchangeService {

    private static Map<Currency, Map<Currency, Float>>  exchangeMap = new HashMap<>();
    private static Map<Country, Currency>  currencyMap = new HashMap<>();

    static {

        currencyMap.put(POLAND, PLN);
        currencyMap.put(UK, GBP);
        currencyMap.put(GERMANY, EUR);
        currencyMap.put(GREECE, EUR);
        currencyMap.put(FRANCE, EUR);
        currencyMap.put(USA, USD);
        currencyMap.put(NORTH_KOREA, KPW);


        Map<Currency, Float> usdMap = new HashMap<>();
        usdMap.put(PLN, 3.42f);
        usdMap.put(GBP, 0.72f);
        usdMap.put(EUR, 0.82f);
        usdMap.put(KPW, 899.60f);

        Map<Currency, Float> eurMap = new HashMap<>();
        eurMap.put(PLN, 4.19f);
        eurMap.put(GBP, 0.89f);
        eurMap.put(USD, 1.23f);
        eurMap.put(KPW, 1102.31f);

        Map<Currency, Float> gbpMap = new HashMap<>();
        gbpMap.put(PLN, 4.73f);
        gbpMap.put(EUR, 1.13f);
        gbpMap.put(USD, 1.39f);
        gbpMap.put(KPW, 1243.92f);

        Map<Currency, Float> plnMap = new HashMap<>();
        plnMap.put(GBP, 0.22f);
        plnMap.put(EUR, 0.24f);
        plnMap.put(USD, 0.30f);
        plnMap.put(KPW, 262.70f);

        Map<Currency, Float> kpwMap = new HashMap<>();
        kpwMap.put(GBP, 0.0008f);
        kpwMap.put(EUR, 0.0009f);
        kpwMap.put(USD, 0.0011f);
        kpwMap.put(PLN, 0.0038f);

        exchangeMap.put(USD, usdMap);
        exchangeMap.put(PLN, plnMap);
        exchangeMap.put(EUR, eurMap);
        exchangeMap.put(GBP, gbpMap);
        exchangeMap.put(KPW, kpwMap);
    }

    @HmlParamAttributes(attributes={@HmlParamAttribute(name="country",hml_type="tpe_Country")

	})
	@HmlReturnAttribute(hml_type = "tpe_Currency")
    public static Currency findCurrency(Country country){
        return currencyMap.get(country);
    }


    @HmlParamAttributes(attributes={@HmlParamAttribute(name="baseCurrency",hml_type="tpe_Currency"),
    		@HmlParamAttribute(name="exchangeCurrency",hml_type="tpe_Currency")

	})
    public static float calculatePrice(float basePrice, Currency baseCurrency, Currency exchangeCurrency){
        return BigDecimal.valueOf(basePrice).multiply(BigDecimal.valueOf(exchangeMap.get(baseCurrency).get(exchangeCurrency)))
        		.setScale(2, BigDecimal.ROUND_HALF_EVEN).floatValue();
    }


}
