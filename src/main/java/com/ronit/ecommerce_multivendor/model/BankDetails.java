package com.ronit.ecommerce_multivendor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;
}
