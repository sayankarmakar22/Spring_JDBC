package com.sayan.jdbc2.Controllers;

import com.sayan.jdbc2.Entity.Student;
import com.sayan.jdbc2.Services.StudentService;
import jdk.jfr.StackTrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.create(student), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Map<String, Object>> getStudent(@PathVariable String id){
        return new ResponseEntity<>(studentService.read(id), HttpStatus.FOUND);
    }
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.update(student), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> createStudent(@RequestParam(name = "id") String id){
        return new ResponseEntity<>(studentService.delete(id), HttpStatus.OK);
    }
}
