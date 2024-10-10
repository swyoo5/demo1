package com.pgm.springdemo.controller;

import com.pgm.springdemo.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {
    //localhost:8080/todo/list
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/list")
    public void list() {
//        log.info("list");
        System.out.println("list");
    }

//    @RequestMapping(value="/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet() {
//        log.info("registerGet");
        System.out.println("registerGet");
    }


//    @RequestMapping(value="/register", method = RequestMethod.POST)
    @PostMapping("/register")
    public String registerPost(@ModelAttribute TodoDTO todoDTO, Model model) {
//        log.info("registerPost");
        System.out.println("registerPost");
//        model.addAttribute("dto", todoDTO);
        return "redirect:/todo/list";
    }
}
