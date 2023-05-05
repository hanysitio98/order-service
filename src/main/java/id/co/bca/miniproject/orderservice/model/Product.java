package id.co.bca.miniproject.orderservice.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Product {

    private Integer id;
    private Integer sellerId;
    private String productName;
    private String productDescription;
    private Double price;
    private Integer stockQuantity;
}
