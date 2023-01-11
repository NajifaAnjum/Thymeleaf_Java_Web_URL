package com.example.CourseWebApp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
    @RequestMapping("/courses")
    public ModelAndView course(@RequestParam("cname") String coursename){                //Servlet request, URL

        ModelAndView mv = new ModelAndView();                                                                       
        mv.addObject("cname",coursename);                                              
        mv.setViewName("course");
        return mv;
    }
}
