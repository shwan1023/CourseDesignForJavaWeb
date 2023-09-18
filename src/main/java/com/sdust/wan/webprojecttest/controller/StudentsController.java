package com.sdust.wan.webprojecttest.controller;

import com.sdust.wan.webprojecttest.entity.Students;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @GetMapping("/append/{no}/{name}")
    public String append(@PathVariable String no,
                      @PathVariable String name){
        return no + name;
    }

    @GetMapping("/append")
    public String appendGet(@RequestBody Students students){
        return students.getNoStudent() + students.getNameStudent();
    }

    @PostMapping("/append")
    public String appendPost(@RequestBody Students students){
        return students.getNoStudent() + students.getNameStudent();
    }
}
