/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.jenkinsxsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author esteban
 */
@RestController()
@RequestMapping("/")
public class DemoController {

    @GetMapping(value = "/hi", produces = "application/json")
    public String sayHi() {
        return "Hello World! Pato Pete Pito Poto Puto";
    }
}
