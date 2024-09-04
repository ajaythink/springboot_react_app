package com.springboot_react_app.springboot_react_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Testing_Controller {

  @GetMapping("/testing")
  public String getMethodName() {
    return "Hello World";
  }

}
