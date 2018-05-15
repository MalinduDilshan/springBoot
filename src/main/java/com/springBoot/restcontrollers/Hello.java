/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springBoot.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MaLindu DiLshan
 */
@RestController
@RequestMapping("/hello")
public class Hello {
    
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
    
}
