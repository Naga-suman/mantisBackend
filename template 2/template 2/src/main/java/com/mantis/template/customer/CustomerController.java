package com.mantis.template.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CustomerEntity customer){
        CustomerEntity response= customerService.createCustomer(customer);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{financerId}")
    public ResponseEntity<List<CustomerEntity>> getCustomerList(@PathVariable("financerId") Integer financerId){
        List<CustomerEntity> response= customerService.financerCustomerList(financerId);
        return ResponseEntity.ok().body(response);

    }

}
