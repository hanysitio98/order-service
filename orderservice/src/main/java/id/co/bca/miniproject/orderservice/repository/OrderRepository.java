package id.co.bca.miniproject.orderservice.repository;

import id.co.bca.miniproject.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findOrderById(Integer id);
}
