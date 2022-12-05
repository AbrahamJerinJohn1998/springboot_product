package com.nest.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
    @GetMapping("/")
    public String homepage()
    {
        return "Welcome Home";
    }
    @GetMapping("/add")
    public String add()
    {
        return "Product add";
    }
    @GetMapping("/edit")
    public String edit()
    {
        return "Product edit";
    }
    @GetMapping("/delete")
    public String delete()
    {
        return "Product delete";
    }
    @GetMapping("/search")
    public String search()
    {
        return "Product search";
    }
}
