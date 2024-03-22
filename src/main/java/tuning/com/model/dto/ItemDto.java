package tuning.com.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Setter
@Getter
public class ItemDto {

    private Long itemId;

    private String name;

    private String vendor;

    private int jan;

    private int feb;

    private int mar;

    private int apr;

    private int may;

    private int jun;

    private int aug;

    private int sep;

    private int oct;

    private int nov;

    private int dec;

    private int total;
}
