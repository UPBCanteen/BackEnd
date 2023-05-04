package com.UPBCanteen.repository;

import com.UPBCanteen.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
