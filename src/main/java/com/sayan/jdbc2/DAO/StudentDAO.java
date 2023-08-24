package com.sayan.jdbc2.DAO;
import com.sayan.jdbc2.Helper.Query;
import com.sayan.jdbc2.StudentFeatures.StuFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.sayan.jdbc2.Entity.Student;

import java.util.Map;

@Component
public class StudentDAO implements StuFeatures {
    @Autowired
    private JdbcTemplate jdbc;
    @Override
    public String create(Student student) {
        jdbc.update(
                Query.getInsert(),
                student.getId(),
                student.getName(),
                student.getRoll(),
                student.getMarks());
        return "student has been created with id of " + student.getId();
    }

    @Override
    public Map<String, Object> read(String id) {
        Map<String, Object> result = jdbc.queryForMap(Query.getRead(),id);
        return result;
    }

    @Override
    public String delete(String id) {
        jdbc.update(Query.getDelete(),
                id);
        return "Account has been deleted and the id is " + id;
    }

    @Override
    public Student update(Student student) {
        jdbc.update(Query.getUpdate(),
                student.getName(),
                student.getRoll(),
                student.getMarks(),
                student.getId());
        return student;
    }
}
