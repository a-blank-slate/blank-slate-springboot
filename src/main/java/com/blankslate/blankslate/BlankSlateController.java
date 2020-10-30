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

  @GetMapping("/")
  public String index() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
    Date date = new Date();
    String response = "Hi, From Blank Slate - SpringBoot App, Current Time is:: "+dateFormat.format(date);
    return response;
  }
}
