package com.ronit.ecommerce_multivendor.model;

import com.ronit.ecommerce_multivendor.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = false)
    private String password;

    private String firstName;
    private String lastName;
    private String mobileNumber;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private UserRole role = UserRole.ROLE_CUSTOMER;

    // 🔥 FIXED (inverse side)
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Seller seller;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<Address> addresses = new HashSet<>();

    // 🔥 FIXED (correct mappedBy)
    @ManyToMany
    @JoinTable(
            name = "user_coupons",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "coupon_id")
    )
    @JsonIgnore
    private Set<Coupon> usedCoupons = new HashSet<>();

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<PaymentOrder> paymentOrders = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<Review> reviews = new HashSet<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Cart cart;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Order> orders = new HashSet<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Wishlist wishlist;
}