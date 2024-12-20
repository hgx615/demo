package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * Create by 7QZS0D3 at 2024/12/16
 */

@RestController
public class DemoController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

}
