package sudobito.rehabilitation.mvc.step5.inner_controllers;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Step5ListController implements Step5Handler {
    @Override
    public String process(Map<String, String> param, Map<String, Object> model) throws ServletException, IOException {
        List<Object> members = new ArrayList<>();

        model.put("members", members);
        return "members";
    }
}
