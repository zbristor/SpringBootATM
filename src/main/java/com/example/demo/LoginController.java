package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller

public class LoginController {
    @Autowired
    private ATMRepository atmRepository;

    @RequestMapping(path="/")
    public String login() {
        return "home";
    }
    @GetMapping(path="/")
    public String getLogin(Model model)
            {
                model.addAttribute(new Transaction());
                return "home";
            }

    @PostMapping(path="/home")
    public @ResponseBody String postLogin(@ModelAttribute Transaction transaction){
        //if(transaction.getAction().equals("withdraw"))
        String val = transaction.getAccountNum() + transaction.getAction();
        atmRepository.save(transaction);
        return val;
    }
    @RequestMapping("/next")
    public @ResponseBody String requestLogin(){
        return atmRepository.findAll().toString();
    }



}

