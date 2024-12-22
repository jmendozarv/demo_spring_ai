package spring.ai.example.demo.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpeAiServiceImplTest {

  @Autowired
  private OpeAiServiceImpl opeAiService;

  @Test
  void getAnwer() {
    String answer = opeAiService.getAnwer("Tell me a dad joke");
    System.out.println("Go to answer");
    System.out.println(answer);
  }
}