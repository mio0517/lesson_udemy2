package com.example.application;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
  
  private final JdbcTemplate jdbc;

  public SampleController(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @GetMapping("/test")
  public String test(Model m) {

    String sql = "SELECT id, name, email FROM inquiry WHERE id = 1";

    Map<String, Object> map = this.jdbc.queryForMap(sql);

    m.addAttribute("title", "Inquiry Form");
    m.addAttribute("name", map.get("name"));
    m.addAttribute("email", map.get("email"));
    return "test";
  }
}