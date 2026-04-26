package tr.com.huseyinaydin.controller.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.huseyinaydin.security.UserPrincipal;
import tr.com.huseyinaydin.service.MessageService;

@Controller
@RequestMapping("/messages")
public class MvcMessageController {

    private final MessageService messageService;

    public MvcMessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/inbox")
    public String inbox(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("messages", messageService.getAllMessageInBox(principal.getUserId()));
        return "admin/message/inbox";
    }

    @GetMapping("/sendbox")
    public String sendbox(Model model, Authentication authentication) {
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        model.addAttribute("messages", messageService.getAllMessageSendBox(principal.getUserId()));
        return "admin/message/sendbox";
    }
}
