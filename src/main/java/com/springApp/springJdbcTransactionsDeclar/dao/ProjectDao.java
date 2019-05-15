package com.springApp.springJdbcTransactionsDeclar.dao;

/**
 * Created by Garik on 31.10.2017.
 */
public interface ProjectDao {

    void createProject(Integer developersId, String projectName, String companyName);
}
