package edu.wctc.salesreporter.imp.pricing;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.ShippingType;

public class HolidayShipping implements ShippingType {

    @Override
    public double getShippingCost(Sale sale) {

        return Double.parseDouble(sale.getAmount()) * .25;

    }
}
