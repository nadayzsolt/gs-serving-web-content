package com.example.coloring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner {
private MyColor myColor;

  @Autowired
  public ColoringApplication(MyColor myColor) {
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringApplication.class, args);
  }

  @Override
  public void run (String... args) throws Exception{
    myColor.printColor();
  }
}
