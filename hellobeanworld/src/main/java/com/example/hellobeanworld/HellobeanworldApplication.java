package com.example.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication  implements CommandLineRunner {
Printer printer;

  @Autowired
  public HellobeanworldApplication (Printer printer){
    this.printer = printer;
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }
}
