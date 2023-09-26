package sa.edu.seu.ticketrs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sa.edu.seu.ticketrs.domain.User;

@Controller
public class SiteController {
    
        // org.springframework.security.core.userdetails.User
      @GetMapping("/")
      public String index(Model model) {
          return "home";
      }
    

    @GetMapping("/login")
    public String loginView(Model model) {
        
        model.addAttribute("user", new User());
        return "login";
    }
    
  
}
