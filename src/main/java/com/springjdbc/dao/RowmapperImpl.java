package com.springjdbc.dao;

import com.springjdbc.entities.student;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RowmapperImpl implements RowMapper<student> {
    public student mapRow(ResultSet rs,int rowNum) throws SQLException
    {
        student st = new student();
        st.setId(rs.getInt(1));
        st.setName(rs.getString(2));
        st.setCity(rs.getString(3));
        return st;
    }
}
