package edu.wctc.salesreporter;

import edu.wctc.salesreporter.face.SalesInput;
import edu.wctc.salesreporter.face.SalesReport;
import edu.wctc.salesreporter.face.ShippingType;

import java.util.List;

public class ReportingMachine {

    private SalesInput in;
    private ShippingType type;
    private SalesReport report;
    private List<Sale> sales;

    public ReportingMachine(SalesInput in, ShippingType type, SalesReport report){
        // takes in what type of report it will be
        this.report = report;
        // takes in what type of input of sales
        this.in = in;
        // takes in what type of shipping cost
        this.type = type;
    }

    public void makeReport(){

        // gets list of sales
        sales = in.getSales();
        // takes the list of sales and gets shipping cost
        // loops through and sets cost to list for report
        for (Sale sale : sales) {
            double shipping = type.getShippingCost(sale);
            sale.setShipping(shipping);
        }
        // generates report from list of sales
        report.generateReport(sales);
    }
}
