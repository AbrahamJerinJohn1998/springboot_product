package com.nest.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
    @PostMapping("/")
    public String homepage()
    {
        return "Welcome Home";
    }
    @PostMapping("/add")
    public String add()
    {
        return "Product add";
    }
    @PostMapping("/edit")
    public String edit()
    {
        return "Product edit";
    }
    @PostMapping("/delete")
    public String delete()
    {
        return "Product delete";
    }
    @PostMapping("/search")
    public String search()
    {
        return "Product search";
    }
    @PostMapping("/view")
    public String view()
    {
        return "Product view";
    }
}
