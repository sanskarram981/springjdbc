package com.springjdbc;

import com.springjdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages = {"com.springjdbc.dao"})
public class JDBCconfig
{
    @Bean(name = "dmds")
    public DriverManagerDataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbcdatabase");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean(name = "jdbctemplate")
    public JdbcTemplate getTemplate()
    {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean(name = "studentdao")
    public StudentDaoImpl getStudentDao()
    {
        StudentDaoImpl st = new StudentDaoImpl();
        st.setJdbctemplate(getTemplate());
        return st;
    }
}
