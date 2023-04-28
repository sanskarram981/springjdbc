package com.springjdbc.dao;

import com.springjdbc.entities.student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate jdbctemplate;

    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

    @Override
    public int insert(student student) {
        String query = "insert into student(id,name,city) values(?,?,?)";
        int result = this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int change(student student)
    {
        String query = "update student set name=?,city=? where id=?";
        int result = this.jdbctemplate.update(query,student.getName(),student.getCity(),student.getId());
        return  result;
    }

    @Override
    public int delete(int id) {
        String query = "delete from student where id=?";
        int result = this.jdbctemplate.update(query,id);
        return  result;
    }
}
