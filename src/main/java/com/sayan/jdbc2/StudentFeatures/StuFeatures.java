package com.sayan.jdbc2.StudentFeatures;

import com.sayan.jdbc2.Entity.Student;

import java.util.Map;

public interface StuFeatures {
    String create(Student student);
    Map<String, Object> read(String id);
    String delete(String id);
    Student update(Student student);
}
