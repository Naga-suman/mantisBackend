package com.mantis.template.customer;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "customers_details")
@Data
public class CustomerEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customers_details_customer_id_seq")
    @SequenceGenerator(allocationSize = 1,  name = "customers_details_customer_id_seq", sequenceName = "customers_details_customer_id_seq")
    @Column(name = "customer_id")
    @JsonProperty("id")
    private Long customerId;
    @Column(name = "financer_id")
    private Long financerId;
    // fname varchar(50),financer_id
    @Column(name = "fname")
    @JsonProperty("firstname")
    private String fname;
    // lname varchar(50),
    @Column(name = "lname")
    @JsonProperty("lastname")
    private String lname;
    // email_id varchar(100),
    @Column(name = "email_id")
    @JsonProperty("email")
    private String emailId;
    // ph_number varchar(10),
    @Column(name = "ph_number")
    @JsonProperty("mobile")
    private String phNumber;
    // is_active boolean,
    @Column(name = "is_active")
    private boolean isActive;
    // house_no varchar(20),
    @Column(name = "house_no")
    @JsonProperty("houseNo")
    private String houseNo;
    // village varchar(50),
    @Column(name = "village")
    @JsonProperty("village")
    private String village;
    // district varchar(70),
    @Column(name = "district")
    @JsonProperty("district")
    private String district;
    // state varchar(50),
    @Column(name = "state")
    @JsonProperty("state")
    private String state;
    // additinal_data varchar(200),
    @Column(name = "additinal_data")
    @JsonProperty("additionalData")
    private String additinalData;
    // created_by varchar(80),
    @Column(name = "created_by")
    private String createdBy;
    // updated_by varchar(80),
    @Column(name = "updated_by")
    private String updatedBy;
    // created_date timestamp,
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private LocalDate createdDate;
    // updated_date timestamp )
    @Column(name = "updated_date")
    private LocalDate updatedDate;


}
