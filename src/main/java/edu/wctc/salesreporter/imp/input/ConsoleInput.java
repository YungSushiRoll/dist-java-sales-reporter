package edu.wctc.salesreporter.imp.input;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.SalesInput;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {

    private List<Sale> saleList = new ArrayList<>();
    private Sale sale;
    private boolean isEndOfList = false;
    private boolean isValidResp = false;
    private Scanner keyboard = new Scanner(System.in);
    private String customer = "";
    private String country = "";
    private String amount = "";
    private String tax = "";

    public ConsoleInput(){
        System.out.println("Console chosen");
    }

    @Override
    public List<Sale> getSales() {
        do {
            String resp;

            System.out.println("Please enter Customer Name: ");
            customer = keyboard.nextLine();

            System.out.println("Please enter the Customer Country: ");
            country = keyboard.nextLine();

            System.out.println("Please enter amount of purchase: ");
            amount = keyboard.nextLine();

            System.out.println("Please enter Tax for purchase: ");
            tax = keyboard.nextLine();

            sale = new Sale(customer,country,amount,tax);

            saleList.add(sale);

            do {
                System.out.println("Will you add another customer Y/N?");

                resp = keyboard.nextLine();

                if (resp.equalsIgnoreCase("Y"))
                {
                    isEndOfList = false;
                    isValidResp = true;

                } else if(resp.equalsIgnoreCase("N")){

                    System.out.println("End of Sales List");
                    isEndOfList = true;
                    isValidResp = true;

                } else {

                    System.out.println("That's not a valid response...");
                    isValidResp = false;
                }
            } while (!isValidResp);

        } while (!isEndOfList);

        return saleList;
    }
}
