package controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.lang.annotation.Annotation;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String helloAction(Model model){
        model.addAttribute("msg","this is my firstSpringMVC");

        return "hello";
    }
    @RequestMapping("/hello2")
    public String helloAction2(Model model){
        model.addAttribute("msg","this is my firstSpringMVC1112312");

        return "hello";
    }













//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("msg","This is my firsySpringMVC");
//        modelAndView.setViewName("/WEB-INF/hello.jsp");
//        return modelAndView;
//    }
}
