package com.mantis.template.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {
    @Query(value = "select * from customers_details where financer_id=?1",nativeQuery = true)
    public List<CustomerEntity> getAllByFinancerId(Integer financerId);

}

