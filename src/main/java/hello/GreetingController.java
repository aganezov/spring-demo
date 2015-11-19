package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class GreetingController {

    @RequestMapping("/")
    public String greeting(@RequestParam(value = "ending", required = false, defaultValue = "!") String ending,
                           @RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("name", name);
        model.addAttribute("ending", ending);
        return "basic";
    }

}