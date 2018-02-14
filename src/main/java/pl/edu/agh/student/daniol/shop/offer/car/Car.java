package pl.edu.agh.student.daniol.shop.offer.car;

public class Car {
    private float baseDailyPrice;
    private float dailyPrice;
    private boolean airConditioner;
    private boolean fullInsurance;

    public Car() {
    }

    public Car(float baseDailyPrice, boolean airConditioner, boolean fullInsurance) {
        this.airConditioner = airConditioner;
        this.fullInsurance = fullInsurance;
        this.baseDailyPrice = baseDailyPrice;

        this.dailyPrice = calculateDailyPrice();
    }

    public float calculateDailyPrice() {
        if(fullInsurance && airConditioner){
            return this.baseDailyPrice * 1.40f;
        } else if(fullInsurance || airConditioner){
            return this.baseDailyPrice * 1.20f;
        } else {
            return this.baseDailyPrice;
        }
    }

    public float getDailyPrice() {
        return dailyPrice;
    }

    public double getBaseDailyPrice() {
        return baseDailyPrice;
    }

    public void setBaseDailyPrice(float baseDailyPrice) {
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
