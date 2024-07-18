package com.luvcode.jobportal.controller;

import com.luvcode.jobportal.entity.Users;
import com.luvcode.jobportal.entity.UsersType;
import com.luvcode.jobportal.services.UsersService;
import com.luvcode.jobportal.services.UsersTypeService;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;



    @Autowired
    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;

    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersTypes = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersTypes);
        model.addAttribute("User", new Users());
        return "register";

    }
   @PostMapping("/register/new")
  public String userRegistration(@Valid Users users){
      System.out.println("User:: "+users);
         return "dashboard";

    }

}
