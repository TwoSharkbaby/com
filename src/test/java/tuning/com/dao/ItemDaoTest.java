package tuning.com.dao;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import tuning.com.model.dto.CustomerDto;
import tuning.com.model.dto.FindCustomerDto;
import tuning.com.model.dto.ItemDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ItemDaoTest {

    @Autowired
    private ItemDao itemDao;

    @Test
    public void selectTopCustomerTest(){
        List<ItemDto> itemDtoList = itemDao.selectTotalSale();
        itemDtoList.forEach(System.out::println);
    }

}