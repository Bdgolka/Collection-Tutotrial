package com.bdgolka;

/**
 * Created by bdgolka on 06.01.2017.
 */
public class Enquiry {

    private final Customer customer;
    private final Category category;

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Category getCategory() {return category; }

    public Customer getCustomer() {return customer; }

    public String toString(){

        return "Enquiry{" +
                "customer=" + customer + '\''  +
                ", cutegory=" + category + '}';
    }
}
