package edu.wctc.salesreporter.imp.pricing;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.ShippingType;

public class FreeShipping implements ShippingType {

    @Override
    public double getShippingCost(Sale sale) {

        return 0.00;

    }
}
