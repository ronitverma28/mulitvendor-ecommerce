package com.ronit.ecommerce_multivendor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;

}
