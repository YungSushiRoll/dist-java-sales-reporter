package edu.wctc.salesreporter.imp.reporting;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.SalesReport;

import java.util.List;

public class DetailReport implements SalesReport {

    final String HEADER = String.format("\n===================\n" +
                        "SALES DETAIL REPORT\n" +
                        "===================\n" +
                        "%-25s %-15s %-10s %-10s %-10s", "Customer", "Country", "Amount","Tax","Shipping");

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println(HEADER);
        for (int x = 0; x < salesList.size(); x++){
            System.out.printf("%-25s %-15s %-10.2f %-10.2f %-10.2f\n",
                    salesList.get(x).getCustomer(), salesList.get(x).getCountry(),
                    Double.parseDouble(salesList.get(x).getAmount()), Double.parseDouble(salesList.get(x).getTax()),
                    salesList.get(x).getShipping());
        }
    }

}
