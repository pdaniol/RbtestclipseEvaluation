package pl.edu.agh.student.daniol.shop.offer.phone;

import pl.edu.agh.student.daniol.shop.profile.Country;
import pl.edu.agh.student.daniol.shop.profile.Currency;

import static pl.edu.agh.student.daniol.shop.offer.phone.IPhoneModel.*;
import static pl.edu.agh.student.daniol.shop.profile.Country.*;

import hadesclipse.hml.template.annotation.HmlAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttribute;
import hadesclipse.hml.template.annotation.HmlParamAttributes;
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
				}),
		@HmlType(id = "tpe_IPhoneModel", name = "IPhoneModel", base = "symbolic", values = { 
				@HmlTypeValue(is = "IPhoneX"),
				@HmlTypeValue(is = "IPhone8"),
				@HmlTypeValue(is = "IPhone7"),
				@HmlTypeValue(is = "IPhone6"),
				@HmlTypeValue(is = "IPhoneSE"),
				@HmlTypeValue(is = "IPhone5")
				})
		})


public class IPhone {
    private double basePrice;
    private Currency currency = Currency.USD;
    private IPhoneModel iPhoneModel;

    public IPhone(double basePrice, Currency currency, IPhoneModel iPhoneModel) {
        this.basePrice = basePrice;
        this.currency = currency;
        this.iPhoneModel = iPhoneModel;
    }
    
    public IPhone() {}

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    @HmlAttribute(hml_type = "tpe_IPhoneModel")
    public IPhoneModel getiPhoneModel() {
        return iPhoneModel;
    }

    @HmlAttribute(hml_type = "tpe_IPhoneModel")
    public void setiPhoneModel(IPhoneModel iPhoneModel) {
        this.iPhoneModel = iPhoneModel;
    }

    
    @HmlParamAttributes(attributes={@HmlParamAttribute(name="country",hml_type="tpe_Country")
	})
    public boolean isAvailable(Country country) {
        return (!IPhoneX.equals(iPhoneModel) || USA.equals(country)) && !NORTH_KOREA.equals(country);

    }
}
