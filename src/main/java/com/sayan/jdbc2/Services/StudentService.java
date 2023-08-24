package com.sayan.jdbc2.Services;

import com.sayan.jdbc2.DAO.StudentDAO;
import com.sayan.jdbc2.Entity.Student;
import com.sayan.jdbc2.StudentFeatures.StuFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService implements StuFeatures {
    @Autowired
    private StudentDAO studentDAO;


    @Override
    public String create(Student student) {
        return studentDAO.create(student);
    }

    @Override
    public Map<String, Object> read(String id) {
        return studentDAO.read(id);
    }

    @Override
    public String delete(String id) {
        return studentDAO.delete(id);
    }

    @Override
    public Student update(Student student) {
        return studentDAO.update(student);
    }
}
