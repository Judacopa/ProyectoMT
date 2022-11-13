/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JUAN CONTRERAS
 */
//notaciones de Spring Boot
@RestController
public class HolaController {
    
    //funciones de get
    @GetMapping("/")
    public String hola(){
    
        return "Hola mi tocino no seas papitas que te amo mucho eres mi vida y quiero unos buenos bebes";
    }
}
