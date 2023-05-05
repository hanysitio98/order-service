package id.co.bca.miniproject.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDTO {

    private Integer productId;
    private Integer stockQuantity;
}

