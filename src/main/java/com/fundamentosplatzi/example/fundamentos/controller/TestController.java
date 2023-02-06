package com.fundamentosplatzi.example.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/peruba")
    @ResponseBody
    public ResponseEntity<String> function(){
        //return new ResponseEntity<>("Hola mundo desde controller", HttpStatus.OK);
        return new ResponseEntity<>("hola mundo desde controller, nuevo cambio",HttpStatus.OK);
    }
}
