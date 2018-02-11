package pl.edu.agh.student.daniol.shop.offer.phone;

import pl.edu.agh.student.daniol.shop.profile.Country;
import pl.edu.agh.student.daniol.shop.profile.Currency;

import static pl.edu.agh.student.daniol.shop.offer.phone.IPhoneModel.*;
import static pl.edu.agh.student.daniol.shop.profile.Country.*;

public class IPhone {
    private double basePrice;
    private Currency currency = Currency.USD;
    private IPhoneModel iPhoneModel;

    public IPhone(double basePrice, Currency currency, IPhoneModel iPhoneModel) {
        this.basePrice = basePrice;
        this.currency = currency;
        this.iPhoneModel = iPhoneModel;
    }

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

    public IPhoneModel getiPhoneModel() {
        return iPhoneModel;
    }

    public void setiPhoneModel(IPhoneModel iPhoneModel) {
        this.iPhoneModel = iPhoneModel;
    }

    public boolean isAvailable(Country country) {
        return (!IPhoneX.equals(iPhoneModel) || USA.equals(country)) && !NORTH_KOREA.equals(country);

    }
}
