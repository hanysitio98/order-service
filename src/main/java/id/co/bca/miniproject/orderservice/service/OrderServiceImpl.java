package id.co.bca.miniproject.orderservice.service;

import id.co.bca.miniproject.orderservice.dto.OrderDTO;
import id.co.bca.miniproject.orderservice.model.Order;
import id.co.bca.miniproject.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order create(OrderDTO orderDTO) {
        Order model = new Order();
        model.setSellerId(orderDTO.getSellerId());
        model.setCustomerId(orderDTO.getCustomerId());
        model.setProductId(orderDTO.getProductId());
        model.setTransactionQuantity(orderDTO.getTransactionQuantity());
        model.setTotalPrice(orderDTO.getTotalPrice());
        model.setPaymentType(orderDTO.getPaymentType());
        model.setTransactionStatus(orderDTO.getTransactionStatus());

        return orderRepository.save(model);
    }

    @Override
    public Order update(OrderDTO orderDTO, Integer id) {
        Order model = orderRepository.findOrderById(id);
        model.setId(id);
        model.setSellerId(orderDTO.getSellerId());
        model.setCustomerId(orderDTO.getCustomerId());
        model.setProductId(orderDTO.getProductId());
        model.setTransactionQuantity(orderDTO.getTransactionQuantity());
        model.setTotalPrice(orderDTO.getTotalPrice());
        model.setPaymentType(orderDTO.getPaymentType());
        model.setTransactionStatus(orderDTO.getTransactionStatus());

        return orderRepository.save(model);
    }

    @Override
    public String delete(Integer id) {
        try {
            orderRepository.deleteById(id);
            return "Successfully delete order";
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to delete order");
        }
    }

    @Override
    public Order findOrderById(Integer id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }
}
