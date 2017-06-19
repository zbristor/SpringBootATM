package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(path="/home")
public class LoginController {
    @Autowired
    private ATMRepository atmRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewTransaction(@RequestParam long id)
            {
                Transaction t = new Transaction();
                t.setId(id);
                ATMRepository.save(t);
                return "Saved";
            }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Greeting> getAllUsers()
    {
        return greetRepository.findAll();
    }
}

