package sudobito.rehabilitation.mvc.step5.inner_controllers;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Map;

public interface Step5Handler {
    String process(Map<String, String> paramMap, Map<String, Object> model) throws ServletException, IOException;
}
