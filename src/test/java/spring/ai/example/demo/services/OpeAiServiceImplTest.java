package spring.ai.example.demo.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpeAiServiceImplTest {

  @Autowired
  private OpenAiServiceImpl opeAiService;

  @Test
  void getAnwer() {
    String answer = opeAiService.getAnswer("Write a python script to output numbers from 1 to 100.");
    System.out.println("Go to answer");
    System.out.println(answer);
  }
}