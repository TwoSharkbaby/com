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
public class Item {

    private Long itemId;

    private String name;

    private String code;

    private int sale;

    private int cnt;

    private int price;

    private String vendor;

    private LocalDateTime regDate;
}
