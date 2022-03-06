
package com.huongdanjava.springboot;
 
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class Calculation {
 
  public int sum(int a, int b) {
    return a + b;
  }
}