package com.example.utilityservice.controllers;

import com.example.utilityservice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String firstEndPoint() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String secondEndPoint(Model model) {
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "second";
  }

  @GetMapping("/useful/email")
  public String thirdEndPoint(Model model, @RequestParam(required = false) String email) {
    model.addAttribute("email", email);
    String divBackgroundColor = utilityService.validateEmail(email);
    model.addAttribute("email", email);
    model.addAttribute("divBackgroundColor", divBackgroundColor);
    return "third";
  }
//
//  @GetMapping("/fourth")
//  public String fourthEndPoint(){
//    return "fourth";
//  }
}
