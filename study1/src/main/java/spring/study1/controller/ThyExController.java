package spring.study1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.study1.dto.ItemDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ThyExController {
    @GetMapping("ex01") //요청주소
    public String th01(Model model){
        model.addAttribute("data","타임리프 예제");
        return "thymeleafEx/Ex01.html";//응답주소
    }

    @GetMapping("abc")
    public String th02(Model model){
        model.addAttribute("name","허준석");
        model.addAttribute("phone","010-5898-2103");
        return  "thymeleafEx/Ex1_1.html";
    }

    @GetMapping("ex02")
    public  String th02_1(Model model){
       ItemDto itemDto1 = new ItemDto();
       itemDto1.setItemDetail("상품 상세 설명");
       itemDto1.setItemNm("테스트상품1");
       itemDto1.setPrice(10000);
       itemDto1.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto",itemDto1);
        return "thymeleafEx/Ex02.html";//응답주소
    }

    @GetMapping(value = "ex03")
    public String th03(Model model){
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트상품" + i);
            itemDto.setPrice(10000 * i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList",itemDtoList);
        return "thymeleafEx/Ex03.html";
    }

    @GetMapping(value = "ex04")
    public String th04(Model model){
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트상품" + i);
            itemDto.setPrice(10000 * i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList",itemDtoList);
        return "thymeleafEx/Ex04.html";
    }
    @GetMapping(value = "ex05")
    public String th05(){
        return "thymeleafEx/Ex05.html";
    }

    @GetMapping("ex06")
    public String th06(String param1, String param2, Model model){
        model.addAttribute("param1",param1);
        model.addAttribute("param2",param2);
        return "thymeleafEx/Ex06.html";
    }

    @GetMapping(value = "ex07")
    public String th07(){
        return "thymeleafEx/Ex07.html";
    }

}
