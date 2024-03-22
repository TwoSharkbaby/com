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
public class Customer {

    private Long customerId;

    private String name;

    private String contact;

    private String email;

    private int gender;

    private String address;

    private String code;

    private LocalDateTime regDate;

    public Customer(String name, String contact, String email, int gender, String address, String code, LocalDateTime regDate) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.code = code;
        this.regDate = regDate;
    }
}
