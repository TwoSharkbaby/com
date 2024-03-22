package tuning.com.dao;

import org.apache.ibatis.annotations.Mapper;
import tuning.com.model.dto.CustomerAllDto;
import tuning.com.model.dto.CustomerDto;
import tuning.com.model.dto.FindCustomerDto;

import java.util.List;

@Mapper
public interface CustomerDao {
    List<CustomerDto> selectTopCustomer(FindCustomerDto findCustomerDto);

    List<CustomerAllDto> selectAllCustomer();
}
