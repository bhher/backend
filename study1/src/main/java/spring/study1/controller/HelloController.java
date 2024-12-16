package spring.study1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //spring framework 를 사용하기위해
public class HelloController {
    @GetMapping("hello") //  웹어플리케이션에서 /hello로 들어모면 해당 메서드호출
    public String hello(Model model){
        model.addAttribute("data","허준석씨!!!");
        //addAttribute  에 이름이 "data" 인곳에 value "허준석씨!!!"rk 들어감
        return "hello";//되돌아갈 주소
    }

}
