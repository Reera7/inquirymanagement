package inquirymanagement.example.inquirymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import inquirymanagement.example.inquirymanagement.dto.InquiryDto;
import inquirymanagement.example.inquirymanagement.service.ClientService;
import inquirymanagement.example.inquirymanagement.service.InquiryService;
import inquirymanagement.example.inquirymanagement.service.StatusService;
import inquirymanagement.example.inquirymanagement.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InquiryController {

    @Autowired
    private final StatusService statusService;
    private final UserService userService;
    private final ClientService clientService;
    private final InquiryService inquiryService;

    public InquiryController(StatusService statusService, UserService userService, ClientService clientService,
            InquiryService inquiryService) {
        this.statusService = statusService;
        this.userService = userService;
        this.clientService = clientService;
        this.inquiryService = inquiryService;
    }

    @GetMapping("/")
    public String inquiryList(Model model) {
        model.addAttribute("inquiryList", inquiryService.getInquiryList());
        return "inquiryList";
    }

    @GetMapping("/registerView")
    public String registerView(Model model) {
        model.addAttribute("clientList", clientService.getClientList());
        model.addAttribute("userList", userService.getUserList());
        model.addAttribute("statusList", statusService.getStatusList());
        model.addAttribute("inquiryDto", new InquiryDto());
        return "inquiry";
    }

    @PostMapping("/registerInquiry")
    public String registerInquiry(@Validated @ModelAttribute("inquiryDto") InquiryDto inquiryDto, Model model) {
        model.addAttribute("inquiryList", inquiryService.getInquiryList());
        inquiryService.registerInquiry(inquiryDto);
        return "redirect:/";
    }

    @GetMapping("/editView/{id}")
    public String inquiry(@PathVariable Integer inquiryId, Model model) {
        model.addAttribute("inquiry", inquiryService.getInquiry(inquiryId));
        model.addAttribute("clientList", clientService.getClientList());
        model.addAttribute("userList", userService.getUserList());
        model.addAttribute("statusList", statusService.getStatusList());
        model.addAttribute("inquiryDto", new InquiryDto());
        return "inquiry";
    }
}
