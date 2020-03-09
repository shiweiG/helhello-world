package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@ResponseBody
@RestController
public class Mycontroller {

 @RequestMapping("/name")
   public String name(){
       return ("yao shi wei");
   }
    }

