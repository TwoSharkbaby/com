package tuning.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tuning.com.dao.ItemDao;
import tuning.com.model.dto.ItemDto;
import tuning.com.service.ItemService;
import tuning.com.util.ExcelWriter;

import java.io.IOException;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;

    @Override
    public int selectTotalSale() {
        try {
            ExcelWriter.writeToExcel(itemDao.selectTotalSale());
            return 1;
        } catch (IOException e) {
            System.out.println(e);
            return 0;
        }
    }

}
