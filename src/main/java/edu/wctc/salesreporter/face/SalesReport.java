package edu.wctc.salesreporter.face;

import edu.wctc.salesreporter.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
