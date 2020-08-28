package edu.wctc.salesreporter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReportingApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ReportingMachine)context.getBean("reportingMachine")).makeReport();



        context.close();
    }
}
