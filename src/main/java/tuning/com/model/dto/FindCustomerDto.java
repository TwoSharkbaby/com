package tuning.com.model.dto;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindCustomerDto {

    private String code;

    private Integer gender;

    private String startDate;

    private String endDate;

    private Integer page;
}
