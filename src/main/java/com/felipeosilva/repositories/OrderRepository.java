package com.felipeosilva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeosilva.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
