package tuning.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tuning.com.dao.CustomerDao;
import tuning.com.model.dto.CustomerAllDto;
import tuning.com.model.dto.CustomerDto;
import tuning.com.model.dto.FindCustomerDto;
import tuning.com.service.CustomerService;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao;
    @Override
    public List<CustomerDto> selectTopCustomer(FindCustomerDto findCustomerDto) {
        return customerDao.selectTopCustomer(findCustomerDto);
    }

    @Override
    public List<CustomerAllDto> selectAllCustomer() {
        return customerDao.selectAllCustomer();
    }
}
