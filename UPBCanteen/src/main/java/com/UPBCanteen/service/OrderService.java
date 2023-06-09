package com.UPBCanteen.service;

import com.UPBCanteen.model.Order;
import com.UPBCanteen.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(Order order) {
        orderRepository.save(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }
}
