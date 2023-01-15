package com.shiv.batchdemo.config;


import com.shiv.batchdemo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
