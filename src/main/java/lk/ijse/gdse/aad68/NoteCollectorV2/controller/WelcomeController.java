package lk.ijse.gdse.aad68.NoteCollectorV2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/welcome")
public class WelcomeController {
    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to NoteCollector V2 - 2024");
        return "welcome";
    }
}
