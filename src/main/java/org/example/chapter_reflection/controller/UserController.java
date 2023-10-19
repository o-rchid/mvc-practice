package org.example.chapter_reflection.controller;

import org.example.chapter_reflection.annotation.Controller;
import org.example.chapter_reflection.annotation.Inject;
import org.example.chapter_di.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
