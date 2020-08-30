package edu.wctc.salesreporter;

import edu.wctc.salesreporter.face.SalesInput;
import edu.wctc.salesreporter.face.SalesReport;
import edu.wctc.salesreporter.face.ShippingType;
import edu.wctc.salesreporter.imp.input.*;
import edu.wctc.salesreporter.imp.pricing.*;
import edu.wctc.salesreporter.imp.reporting.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("edu.wctc.salesreporter")
public class AppConfig {


    @Bean
    public SalesInput getInput(){
        //return new ConsoleInput();
        return new FileInput();
    }

    @Bean
    public ShippingType getType(){
        return new FreeShipping();
        //return new HolidayShipping();
        //return new FlatRateShipping();
    }

    @Bean
    public SalesReport getReport(){
        return new DetailReport();
        //return new SummaryReport();
    }

    @Bean
    public ReportingMachine reportingMachine(){
        return new ReportingMachine(getInput(),getType(),getReport());
    }
}
