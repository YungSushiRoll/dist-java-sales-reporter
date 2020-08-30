package edu.wctc.salesreporter.imp.pricing;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.ShippingType;

public class FlatRateShipping implements ShippingType {
    @Override
    public double getShippingCost(Sale sale) {
        if (Double.parseDouble(sale.getAmount()) > 150.00){
            return 10.25;
        } else if (Double.parseDouble(sale.getAmount()) >= 85.00){
            return 8.50;
        } else if (Double.parseDouble(sale.getAmount()) >= 55.00){
            return 7.25;
        } else if (Double.parseDouble(sale.getAmount()) >= 30.00){
            return 4.35;
        } else if (Double.parseDouble(sale.getAmount()) > 15.00){
            return 2.25;
        } else {
            return 1.00;
        }
    }
}
