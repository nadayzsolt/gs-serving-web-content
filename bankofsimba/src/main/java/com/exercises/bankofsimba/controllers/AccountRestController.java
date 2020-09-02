package com.exercises.bankofsimba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

@GetMapping("greeting")
  @ResponseBody
  public String inceptTextToHTML(){
    String textToBeShown = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    return textToBeShown;
  }
  @Autowired
}