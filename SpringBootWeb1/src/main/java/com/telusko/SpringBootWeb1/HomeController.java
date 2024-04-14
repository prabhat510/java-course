package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("number1") int num1, @RequestParam("number2") int num2, HttpSession session) {
        System.out.println("in add");
        int result = num1 + num2;
        System.out.println(result);
        session.setAttribute("result", result);
        return "result";
    }
}
