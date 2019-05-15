package com.springApp.springJdbcTransactionsDeclar.dao.jdbc;

import com.springApp.springJdbcTransactionsDeclar.dao.DeveloperDao;
import com.springApp.springJdbcTransactionsDeclar.model.Developer;
import com.springApp.springJdbcTransactionsDeclar.model.Project;
import com.springApp.springJdbcTransactionsDeclar.util.DeveloperMapper;
import com.springApp.springJdbcTransactionsDeclar.util.ProjectMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Implementation Developer DAO based on JdbcTemplate.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class JdbcTemplateDeveloperDaoImpl implements DeveloperDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createDeveloper(String name, String speciality, Integer experience) {

        String SQL = "INSERT INTO DEVELOPERS (name, speciality, experience) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, name, speciality, experience);
        System.out.println("Developer successfully created.\nName: " + name + ";\nSpeciality: " +
                speciality + ";\nExperience: " + experience + "\n");
    }

    public List<Developer> listDevelopers() {
        String SQL = "SELECT * FROM DEVELOPERS";
        List<Developer> developers = jdbcTemplate.query(SQL, new DeveloperMapper());
        return developers;
    }

    public List<Project> listDevelopersProjects(Integer id) {
        String SQL = "SELECT * FROM PROJECTS WHERE DEVELOPERS_ID = " + id;
        List<Project> projectList = jdbcTemplate.query(SQL, new ProjectMapper());
        return projectList;
    }


}
