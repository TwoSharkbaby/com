package tuning.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tuning.com.model.dto.FindCustomerDto;
import tuning.com.service.CustomerService;
import tuning.com.service.ItemService;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("")
    public String main(){
        return "item/all";
    }

    @GetMapping("/all")
    public String all(Model model){
        model.addAttribute("result", itemService.selectTotalSale());
        return "item/all";
    }

}
