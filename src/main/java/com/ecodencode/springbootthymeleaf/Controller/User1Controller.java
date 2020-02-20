package com.ecodencode.springbootthymeleaf.Controller;

import com.ecodencode.springbootthymeleaf.Model.User1;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class User1Controller {

  @RequestMapping("add")
  public String toAdd(User1 user) {

    // return to templates/add.html page.
    return "add";
  }

  @RequestMapping("addUser")
  public String add(@Valid User1 user, BindingResult result) {
    if (result.hasErrors()) {

      // return to templates/add.html page.
      return "add";
    }
    System.out.println("Save user =" + user);

    // return to templates/success.html page.
    return "success";
  }
}
