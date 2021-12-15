package com.example.minbeerbar01.services;

import com.example.minbeerbar01.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

}
