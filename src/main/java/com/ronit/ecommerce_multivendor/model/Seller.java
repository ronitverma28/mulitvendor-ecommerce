package com.ronit.ecommerce_multivendor.model;

import com.ronit.ecommerce_multivendor.model.enums.AccountStatus;
import com.ronit.ecommerce_multivendor.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sellerName;

    private String mobileNumber;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "business_details_id")
    private BusinessDetails businessDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_details_id")
    private BankDetails bankDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickup_address_id")
    private Address pickupAddress;

    private String GSTIN;

    private UserRole role= UserRole.ROLE_SELLER;

    private boolean isEmailVerified=false;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;

    @OneToOne(mappedBy = "seller")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "seller")
    @JsonIgnore
    private List<Product> products;
}
