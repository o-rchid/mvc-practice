package org.example.chapter_reflection.controller;

import org.example.chapter_reflection.annotation.Controller;
import org.example.chapter_reflection.annotation.RequestMapping;
import org.example.chapter_reflection.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response) {
        return "home";
    }
}
