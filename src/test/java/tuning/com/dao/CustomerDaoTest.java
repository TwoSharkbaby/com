package tuning.com.dao;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import tuning.com.model.dto.CustomerDto;
import tuning.com.model.dto.FindCustomerDto;

import java.util.List;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;

    @Test
    public void selectTopCustomerTest(){
        FindCustomerDto topCustomer = FindCustomerDto.builder()
                .code("code5")
                .gender(0)
                .startDate("20200101")
                .endDate("20200401")
                .page(1).build();
        List<CustomerDto> customerDtoList = customerDao.selectTopCustomer(topCustomer);
        customerDtoList.forEach(System.out::println);
    }



}