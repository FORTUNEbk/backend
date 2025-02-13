package com.eboutique.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eboutique.backend.backend.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
