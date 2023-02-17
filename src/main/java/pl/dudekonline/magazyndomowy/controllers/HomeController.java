package pl.dudekonline.magazyndomowy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

    @GetMapping("/")
    String showHomePage(){
        return "home";
    }
}
