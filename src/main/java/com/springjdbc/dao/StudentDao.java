package com.springjdbc.dao;

import com.springjdbc.entities.student;

import java.util.List;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);
    public int delete(int id);
    public student getstudent(int id);
    public List<student> getallstudent();
}

