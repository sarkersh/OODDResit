package ooddresit.spring;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MVCController {

    @RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(Model model) {
        return "redirect:/index.html";
        
    }
   
  
    // TODO add other routes to create a working application.
    
    @RequestMapping(value="/home", method= {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model, HttpSession session) {
        return "home";
    }

}
