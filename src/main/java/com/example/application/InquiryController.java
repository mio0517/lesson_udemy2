package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

  @GetMapping("/form")
  public String form(InquiryForm inquiryForm, Model m) {
    m.addAttribute("title", "Inquiry Form");

    return "form";
  }

  @ PostMapping("/form")
  public String formGoBack(InquiryForm inquiryForm, Model m) {
    m.addAttribute("title", "Inquiry Form");

    return "form";
  }

  @PostMapping("/confirm")
  public String confirm(@Validated InquiryForm inquiryForm,
  BindingResult result,
  Model m) {
    if(result.hasErrors()) {
      m.addAttribute("title", "Inquiry Form");
      return "form";
    }
    m.addAttribute("title", "Confirm Page");
    return "confirm";
  }
    
  }
  

