package com.example;
@Controller
public class HomeController {

    @RequestMapping(value="/")
    public String home(){
        return "index";
    }