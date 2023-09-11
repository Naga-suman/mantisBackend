package com.mantis.template.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    public CustomerEntity createCustomer(CustomerEntity customer){
        CustomerEntity response= null;
        try{
            response = customerRepo.save(customer);
        }catch (Exception ex){
            throw ex;
        }
        return response;
    }

    public List<CustomerEntity> financerCustomerList(Integer financerId){
        List<CustomerEntity> response= new ArrayList<>();
        try{
            response = customerRepo.getAllByFinancerId(financerId);
        }catch (Exception ex){
            throw ex;
        }
        return response;
    }
}
