package com.exercises.bankofsimba.controllers;

import com.exercises.bankofsimba.model.BankAccount;
import com.exercises.bankofsimba.repositories.BankAccountInventory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
  BankAccountInventory bankAccountInventory = new BankAccountInventory();

  @GetMapping("/")
  public String showAccounts (Model model){
    model.addAttribute("accounts", bankAccountInventory.getBankAccounts());
    return "index";
  }

  @GetMapping("/oneaccount.html")
  public String showOneAccount (Model model){
    BankAccount bankAccount = new BankAccount();
    model.addAttribute("theAccount", bankAccount);
    return "oneaccount";
  }

  @GetMapping("/greetings")
  public String showStr (Model model){
    String greeting = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("greeting", greeting);
    return "greetings";
  }
 }
