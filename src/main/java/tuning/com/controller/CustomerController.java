package tuning.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tuning.com.model.dto.FindCustomerDto;
import tuning.com.service.CustomerService;

@Controller
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    @ModelAttribute("findCustomerDto")
    public FindCustomerDto setDefaultFindCustomerDto() {
        FindCustomerDto findCustomerDto = new FindCustomerDto();
        findCustomerDto.setCode("code1");
        findCustomerDto.setGender(0);
        findCustomerDto.setStartDate("20200101");
        findCustomerDto.setEndDate("20200131");
        findCustomerDto.setPage(1);
        return findCustomerDto;
    }

    private final CustomerService customerService;

    @GetMapping("/part")
    public String part(@ModelAttribute("findCustomerDto") FindCustomerDto findCustomerDto, Model model){
        model.addAttribute("result", customerService.selectTopCustomer(findCustomerDto));
        return "customer/part";
    }

    @GetMapping("/all")
    public String all(Model model){
        model.addAttribute("result", customerService.selectAllCustomer());
        return "customer/all";
    }
}
