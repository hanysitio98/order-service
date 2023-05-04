package id.co.bca.miniproject.orderservice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OrderDTO {

    private Integer sellerId;
    private Integer customerId;
    private Integer productId;
    private Integer transactionQuantity;
    private Double totalPrice;
    private String paymentType;
    private String transactionStatus;

}
