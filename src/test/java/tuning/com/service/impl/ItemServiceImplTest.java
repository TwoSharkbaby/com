package tuning.com.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tuning.com.service.ItemService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemServiceImplTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void makeExcel(){
        System.out.println(itemService.selectTotalSale());
    }

}