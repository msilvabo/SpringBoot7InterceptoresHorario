package com.learning.interceptorhttphorario.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping(("/foo"))
    public ResponseEntity<?> foo(HttpServletRequest request)
    {
        Map<String, Object> data = new HashMap<>();
        data.put("Title", "Biennvenidos al sistema");
        data.put("Date now", new Date().toString());
        data.put("message",request.getAttribute("message"));
        return ResponseEntity.ok(data);
    }
}
