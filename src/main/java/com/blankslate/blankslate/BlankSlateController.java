package com.blankslate.blankslate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/")
public class BlankSlateController {

  @GetMapping("/index")
  public String index() {
    String response = "Greetings from Spring Boot!";
    return response;
  }

  @GetMapping("/getSystemTime")
  public String getSystemTime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
  }
}
