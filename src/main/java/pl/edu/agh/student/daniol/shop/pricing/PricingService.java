package pl.edu.agh.student.daniol.shop.pricing;

import pl.edu.agh.student.daniol.shop.utils.MathUtils;

import java.util.HashMap;
import java.util.Map;

public class PricingService {

    private SaleStatus saleStatus;

    private static Map<SaleStatus, Double> saleDiscountMap = new HashMap<>();
    private static Map<CustomerStatus, Double> customerDiscountMap = new HashMap<>();

    static {
        customerDiscountMap.put(CustomerStatus.GOLD, 0.2);
        customerDiscountMap.put(CustomerStatus.SILVER, 0.1);
        customerDiscountMap.put(CustomerStatus.NONE, 0.0);

        saleDiscountMap.put(SaleStatus.GOLD_SALE, 0.5);
        saleDiscountMap.put(SaleStatus.MONDAY_SALE, 0.05);
        saleDiscountMap.put(SaleStatus.SILVER_SALE, 0.35);
        saleDiscountMap.put(SaleStatus.REGULAR_SALE, 0.2);
        saleDiscountMap.put(SaleStatus.NONE,  0.0);
    }


    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(SaleStatus saleStatus) {
        this.saleStatus = saleStatus;
    }

    public CustomerStatus checkStatus(int loyaltyPoints){
        if(loyaltyPoints > 10000){
            return CustomerStatus.GOLD;
        } else if (loyaltyPoints > 5000){
            return CustomerStatus.SILVER;
        } else {
            return CustomerStatus.NONE;
        }
    }

    public double calculateDiscount(int loyaltyPoints, SellerMood sellerMood){
        CustomerStatus customerStatus = checkStatus(loyaltyPoints);
        double discount = MathUtils.pickGreater(saleDiscountMap.get(saleStatus), customerDiscountMap.get(customerStatus));

        if(SellerMood.GOOD.equals(sellerMood)){
            discount += 0.05;
        }

        return discount;
    }




}
