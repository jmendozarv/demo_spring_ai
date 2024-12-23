package spring.ai.example.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.ai.example.demo.model.Answer;
import spring.ai.example.demo.model.GetCapitalRequest;
import spring.ai.example.demo.model.GetCapitalResponse;
import spring.ai.example.demo.model.Question;
import spring.ai.example.demo.services.OpenAiService;

@RestController
@AllArgsConstructor
public class QuestionController {
  private final OpenAiService openAiService;

  @PostMapping("/capitalWithInfo")
  public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
    return openAiService.getCapitalWithInfo(getCapitalRequest);
  }

  @PostMapping("/capital")
  public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
    return openAiService.getCapital(getCapitalRequest);
  }

  @PostMapping("/ask")
  public Answer askQuestion(@RequestBody Question question) {
    return openAiService.getAnswer(question);
  }

}
