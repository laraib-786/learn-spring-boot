package com.etcher.example.learnspringboot.controller

import com.etcher.example.learnspringboot.dto.Courses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CourseController{

    @GetMapping("/courses")
    fun getCourse(): List<Courses> {
        return listOf(Courses(id = 1, name= "Learn AWS", author = "in28minutes"), Courses(id = 2, name= "Learn Python", author = "etcher"))
    }

}