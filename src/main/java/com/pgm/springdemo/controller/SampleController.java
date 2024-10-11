package com.pgm.springdemo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        return "hello";
    }

    @GetMapping("/ex1")
    public void ex1(@RequestParam("name") String name,
                    @RequestParam("age") int age,
                    @RequestParam("gender") String gender,
                    Model model) { // model : 뷰로 데이터를 전달할 때 사용
        log.info("ex1");
        log.info(name);
        log.info(age);
        log.info(gender);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("gender", gender);
    }

    @GetMapping("/ex2/{name}")
    public void ex2(@PathVariable("name") String name) {//경로 변수를 받아준다?
        log.info("ex2");
        log.info(name);
    }

    @GetMapping("/ex3")
    public void ex3(@RequestParam("dueDate") LocalDate dueDate, Model model) {
        log.info("ex3");
        log.info(dueDate);
        model.addAttribute("dueDate", dueDate);
    }

    @GetMapping("ex4")
    public String ex4(RedirectAttributes redirectAttributes) {// RedirectAttributes : ex5로 전달해야될 데이터를 전달
        log.info("ex4");
//        addFlash : 1회용
        redirectAttributes.addFlashAttribute("result", "Success");
//        addAttribute : ex5 파라미터로 전달 => 지워지지 않음
        redirectAttributes.addAttribute("name", "aaaa");
        return "redirect:/ex5"; // redirect : 뷰를 바로 찾는것이 아니라 ex5라는 컨트롤러 함수를 찾게됨
    }

    @GetMapping("/ex5")
    public void ex5(@RequestParam("name") String name, Model model) {
        log.info("ex5");
        log.info(name);
        model.addAttribute("name", name);
    }

    @GetMapping("/ex6") // 앞에 슬래시가 있어도되고 없어도 됨. 있는게 정석임
    public void ex6(@RequestParam("p1") String p1,
                    @RequestParam("p2") int p2) { // 스트링 정수를 받아도 정수형으로 들어감
        System.out.println("ex6");
        System.out.println(p1);
    }
}
