package de.htwg.swqs.shopui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @GetMapping(value = {"/", "", "home"})
  public String home(Model model) {
    model.addAttribute("title", "E-Commerce Shop | Home");
    return "index";
  }

  @GetMapping(value = {"about"})
  public String about(Model model) {
    model.addAttribute("title", "E-Commerce Shop | About");
    return "about";
  }
}
