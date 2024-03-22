package tuning.com.dao;

import org.apache.ibatis.annotations.Mapper;
import tuning.com.model.dto.ItemDto;

import java.util.List;

@Mapper
public interface ItemDao {
    List<ItemDto> selectTotalSale();

}
