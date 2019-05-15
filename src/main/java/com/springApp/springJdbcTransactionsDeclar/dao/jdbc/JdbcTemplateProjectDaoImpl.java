package com.springApp.springJdbcTransactionsDeclar.dao.jdbc;

import com.springApp.springJdbcTransactionsDeclar.dao.ProjectDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Garik on 31.10.2017.
 */
public class JdbcTemplateProjectDaoImpl implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createProject(Integer developerId, String projectName, String companyName) {

        String SQL = "INSERT INTO PROJECTS (DEVELOPERS_ID, NAME, COMPANY) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, developerId, projectName, companyName);
        System.out.println("Project record created successfully. Project name: " +
                projectName + ", Company: " + companyName + "\n");
    }
}
