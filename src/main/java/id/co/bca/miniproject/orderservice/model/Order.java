package id.co.bca.miniproject.orderservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "transaction_quantity")
    private Integer transactionQuantity;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "transaction_status")
    private String transactionStatus;


}
