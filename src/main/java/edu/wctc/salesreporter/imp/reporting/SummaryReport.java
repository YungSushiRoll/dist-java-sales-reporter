package edu.wctc.salesreporter.imp.reporting;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.SalesReport;

import java.util.ArrayList;
import java.util.List;

public class SummaryReport implements SalesReport {

    private double totalAmount = 0;
    private double totalTax = 0;
    private double totalShipping = 0;
    private List<Sale> summaryList = new ArrayList<>();
    boolean isNotAMatch = false;
    private int currentIndex = 1;

    final String HEADER = String.format("\n====================\n" +
            "SALES SUMMARY REPORT\n" +
            "====================\n" +
            "%-15s %-10s %-10s %-10s", "Country", "Amount","Tax","Shipping");

    @Override
    public void generateReport(List<Sale> salesList) {

        for (Sale sale : salesList) {
            System.out.println(currentIndex);
            if (summaryList.isEmpty()){
                System.out.println("here1");
                summaryList.add(sale);
                totalAmount += Double.parseDouble(summaryList.get(0).getAmount());
                totalTax += Double.parseDouble(summaryList.get(0).getTax());
                totalShipping += summaryList.get(0).getShipping();
            } else {
                System.out.println("here?");
                for (int x = 0; x < summaryList.size(); x++) {
                    if (sale.getCountry().equalsIgnoreCase(summaryList.get(x).getCountry())) {
                        System.out.println("hello");
                        System.out.println(salesList.get(currentIndex).getAmount());
                        System.out.println(salesList.get(currentIndex).getTax());
                        System.out.println(salesList.get(currentIndex).getShipping());

                        totalAmount = Double.parseDouble(summaryList.get(x).getAmount()) + Double.parseDouble(salesList.get(currentIndex).getAmount());
                        System.out.println(totalAmount);
                        totalTax =  Double.parseDouble(summaryList.get(x).getTax()) + Double.parseDouble(salesList.get(currentIndex).getTax());
                        System.out.println(totalTax);
                        totalShipping = summaryList.get(x).getShipping() +  salesList.get(currentIndex).getShipping();
                        System.out.println(totalShipping);

                        summaryList.get(x).setAmount(Double.toString(totalAmount));
                        summaryList.get(x).setTax(Double.toString(totalTax));
                        summaryList.get(x).setShipping(totalShipping);
                        System.out.println("were done");
                        System.out.println("were about to break");
                        isNotAMatch = false;
                        break;
                    } else {
                        System.out.println(isNotAMatch);
                        System.out.println("howd we get here");
                        isNotAMatch = true;
                    }
                }
                if (isNotAMatch) {
                    System.out.println(isNotAMatch);
                    System.out.println("here");
                    summaryList.add(sale);
                }
                currentIndex++;
            }
        }

        System.out.println(HEADER);
        for (int y = 0; y < summaryList.size(); y++){
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f\n",
                    summaryList.get(y).getCountry(), Double.parseDouble(summaryList.get(y).getAmount()), Double.parseDouble(summaryList.get(y).getTax()),
                    summaryList.get(y).getShipping());
        }

    }
}
