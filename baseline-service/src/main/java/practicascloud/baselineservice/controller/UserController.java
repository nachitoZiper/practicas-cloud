package practicascloud.baselineservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Oscar I. Obregon
 */
@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
