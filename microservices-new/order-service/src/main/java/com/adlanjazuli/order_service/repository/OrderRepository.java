package com.adlanjazuli.order_service.repository;

import com.adlanjazuli.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
