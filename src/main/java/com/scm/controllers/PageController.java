package com.scm.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {

        System.out.println("home page handler ");
        model.addAttribute("name","Komal");
        model.addAttribute("email","komal@gmail.com");
        model.addAttribute("address","XYZZZ");
        model.addAttribute("githublink","https://github.com/komalsingh02/smart-contact-manager");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage(Model modal)
    {
        modal.addAttribute("isLogin",false);
        System.out.println("about page loading");
        return "about";
    }
    //services route
    @RequestMapping("/services")
    public String servicePage()
    {
        System.out.println("services page loading");
        return "services";
    }

}
