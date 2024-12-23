package spring.ai.example.demo.services;

import spring.ai.example.demo.model.Answer;
import spring.ai.example.demo.model.GetCapitalRequest;
import spring.ai.example.demo.model.GetCapitalResponse;
import spring.ai.example.demo.model.Question;

public interface OpenAiService {
  String getAnswer(String question);

  Answer getAnswer(Question question);

  Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

  GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
}
