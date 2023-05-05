package id.co.bca.miniproject.orderservice.controller;

import id.co.bca.miniproject.orderservice.dto.OrderDTO;
import id.co.bca.miniproject.orderservice.model.Order;
import id.co.bca.miniproject.orderservice.service.OrderService;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Order> findAll() {
        return orderService.findAllOrder();
    }

    @GetMapping("/order")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Order findByProductId(@RequestParam("id") Integer id) {
        return orderService.findOrderById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Object createProduct(ServletRequest servletRequest, @RequestBody OrderDTO orderDTO ) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        try {
            return orderService.create(orderDTO, Integer.parseInt(request.getHeader("product")));
        } catch (Exception e) {
            throw e;
        }
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Object updateProduct(@RequestBody OrderDTO orderDTO, @RequestParam("id") Integer id) {
        return orderService.update(orderDTO, id);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Object deleteProduct(@RequestParam("id") Integer id) {
        return orderService.delete(id);
    }
}
