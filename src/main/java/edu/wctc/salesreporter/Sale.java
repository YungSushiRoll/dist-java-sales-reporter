package edu.wctc.salesreporter;

public class Sale {

    private String customer;
    private String country;
    private String amount;
    private String tax;
    private double shipping;

    public Sale(String customer, String country, String amount, String tax) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public double getShipping() {
        return shipping;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public String getAmount() {
        return amount;
    }

    public String getTax() {
        return tax;
    }

    public String toString(){
        return customer + "," + country + "," + amount + "," + tax;
    }
}
