package tuning.com.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderItems {

    private Long orderItemsId;

    private Long orderId;

    private int quantity;

    private int totalSale;

    private Long itemId;

    private LocalDateTime orderDate;
}
