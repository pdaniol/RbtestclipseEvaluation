package pl.edu.agh.student.daniol.shop.offer.car;

import pl.edu.agh.student.daniol.shop.profile.Currency;

public class Car {
    private double baseDailyPrice;
    private double dailyPrice;
    private boolean airConditioner;
    private boolean fullInsurance;

    public Car() {
    }

    public Car(double baseDailyPrice, boolean airConditioner, boolean fullInsurance) {
        this.airConditioner = airConditioner;
        this.fullInsurance = fullInsurance;
        this.baseDailyPrice = baseDailyPrice;

        this.dailyPrice = calculateDailyPrice();
    }

    public double calculateDailyPrice() {
        if(fullInsurance && airConditioner){
            return this.baseDailyPrice * 1.40;
        } else if(fullInsurance || airConditioner){
            return this.baseDailyPrice * 1.20;
        } else {
            return this.baseDailyPrice;
        }
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public double getBaseDailyPrice() {
        return baseDailyPrice;
    }

    public void setBaseDailyPrice(double baseDailyPrice) {
        this.baseDailyPrice = baseDailyPrice;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean isFullInsurance() {
        return fullInsurance;
    }

    public void setFullInsurance(boolean fullInsurance) {
        this.fullInsurance = fullInsurance;
    }


}
