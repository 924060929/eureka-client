package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class AuthorityController {
    @RequestMapping(value = "hasAuthority", method = RequestMethod.GET)
    public Map hasAuthority(@RequestParam String username) {
        Map result = new HashMap<>();
        result.put("status", 1);
        result.put("message", "success");
        return result;
    }
}
