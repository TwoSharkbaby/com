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
public class OrderInfo {

    private Long orderInfoId;

    private Long customerId;

    private LocalDateTime orderDate;

    private int totalSale;

    private String state;
}
