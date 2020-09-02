package com.exercises.bankofsimba.repositories;

import com.exercises.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import java.util.List;

public class BankAccountInventory {
private List<BankAccount> bankAccounts;

public BankAccountInventory(){
  bankAccounts = new ArrayList<>();
  bankAccounts.add(new BankAccount());
  bankAccounts.add(new BankAccount("bela", 5000, "zebra"));
}

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  public void addBankAccount(BankAccount bankAccount){
  this.bankAccounts.add(bankAccount);
  }
}
