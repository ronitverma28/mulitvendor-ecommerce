package com.ronit.ecommerce_multivendor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BusinessDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String businessName;
    private String businessEmail;
    private String businessMobile;
    private String businessAddress;
    private String logo;
    private String banner;

}
