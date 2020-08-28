package edu.wctc.salesreporter.face;

import edu.wctc.salesreporter.Sale;

public interface ShippingType {
    double getShippingCost(Sale sale);
}
