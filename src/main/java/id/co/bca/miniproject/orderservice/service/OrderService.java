package id.co.bca.miniproject.orderservice.service;

import id.co.bca.miniproject.orderservice.dto.OrderDTO;
import id.co.bca.miniproject.orderservice.model.Order;

import java.util.List;

public interface OrderService {

    Order create(OrderDTO orderDTO, Integer productId);
    Order update(OrderDTO orderDTO, Integer orderId);
    String delete(Integer orderId);
    Order findOrderById(Integer orderId);
    List<Order> findAllOrder();
}
