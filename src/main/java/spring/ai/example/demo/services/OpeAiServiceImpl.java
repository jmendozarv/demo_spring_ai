package spring.ai.example.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

// Anotación @Service para indicar que esta clase es un componente de servicio en el contexto de Spring
@Service
// Anotación @AllArgsConstructor de Lombok para generar un constructor con un parámetro para cada campo en la clase
@AllArgsConstructor
public class OpeAiServiceImpl implements OpeAiService {

  // Dependencia final de ChatModel, inyectada a través del constructor
  private final ChatModel chatModel;

  // Método principal que toma una pregunta como parámetro y devuelve una respuesta generada por el modelo de IA
  public String getAnwer(String question) {
    // Crear un objeto PromptTemplate usando la pregunta de entrada
    PromptTemplate promptTemplate = new PromptTemplate(question);
    // Usar el PromptTemplate para crear un objeto Prompt
    Prompt prompt = promptTemplate.create();

    // Pasar el objeto Prompt al método call del chatModel, que devuelve un objeto ChatResponse
    ChatResponse response = chatModel.call(prompt);

    // Extraer el contenido de la respuesta del objeto ChatResponse y devolverlo como una cadena
    return response.getResult().getOutput().getContent();
  }
}