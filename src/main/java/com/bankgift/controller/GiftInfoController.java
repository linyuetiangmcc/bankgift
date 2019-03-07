package com.bankgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/gift")
public class GiftInfoController {

    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("giftinfo/list");
    }
}
