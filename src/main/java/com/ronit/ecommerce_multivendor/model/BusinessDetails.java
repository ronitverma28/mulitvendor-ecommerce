package com.ronit.ecommerce_multivendor.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class BusinessDetails {
    private String businessName;
    private String businessEmail;
    private String businessMobile;
    private String businessAddress;
    private String logo;
    private String banner;

}
