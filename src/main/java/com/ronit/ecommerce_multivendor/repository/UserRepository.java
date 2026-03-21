package com.ronit.ecommerce_multivendor.repository;

import com.ronit.ecommerce_multivendor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
