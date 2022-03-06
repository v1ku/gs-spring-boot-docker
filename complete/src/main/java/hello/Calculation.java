package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calculator {
    
    public static int add(int x, int y){
      return x + y;
    }

}