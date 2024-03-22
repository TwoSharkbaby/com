package tuning.com.service;

import tuning.com.model.dto.CustomerAllDto;
import tuning.com.model.dto.CustomerDto;
import tuning.com.model.dto.FindCustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> selectTopCustomer(FindCustomerDto topCustomer);

    List<CustomerAllDto> selectAllCustomer();

}
