package com.learnings.employeeinfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController  {

    @RequestMapping(value = "/")
    public String homePage() {
        return "index";
    }
}
