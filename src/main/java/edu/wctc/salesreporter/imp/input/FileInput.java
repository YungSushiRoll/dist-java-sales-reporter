package edu.wctc.salesreporter.imp.input;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.SalesInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {

    private Sale sale;
    private String customer = "";
    private String country = "";
    private String amount = "";
    private String tax = "";
    private List<Sale> sales = new ArrayList<>();
    private File file = new File("sales.txt");
    private Scanner reader;

    public FileInput(){
        System.out.println("File Chosen");
    }

    @Override
    public List<Sale> getSales() {

        try {
            reader = new Scanner(file);
            while (reader.hasNext()){
                String line = reader.nextLine();
                String[] salesStuff =  line.split(",");
                customer = salesStuff[0];
                country = salesStuff[1];
                amount = salesStuff[2];
                tax = salesStuff[3];
                sale = new Sale(customer,country,amount,tax);
                sales.add(sale);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sales;
    }
}
