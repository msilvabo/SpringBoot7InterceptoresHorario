package com.learning.interceptorhttphorario.controllers;

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
    public ResponseEntity<?> foo()
    {
        Map<String, Object> data = new HashMap<>();
        data.put("Title", "Biennvenidos al sistema");
        data.put("time", new Date());
        return ResponseEntity.ok(data);
    }
}
