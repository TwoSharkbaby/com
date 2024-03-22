package tuning.com.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Setter
@Getter
public class CustomerAllDto {

    private Long customerId;

    private String name;

    private String address;

    private String email;

    private int total;

}
