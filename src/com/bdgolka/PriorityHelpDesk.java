package com.bdgolka;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by bdgolka on 06.01.2017.
 */
public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {

        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private  final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public  void enquire (final Customer customer, final Category category){

        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries(){

        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null ) {

            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {

        PriorityHelpDesk helpDesk = new PriorityHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquiries();
    }
}
