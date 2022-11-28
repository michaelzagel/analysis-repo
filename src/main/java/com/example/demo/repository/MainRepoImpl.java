package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class MainRepoImpl implements MainRepo{
    private Connection connection ;

    @Override
    public void saveName(String name) {

    }

    @Override
    public List<String> getList(String name) throws SQLException {
        String sqlQuery = "Select * from users where name = " + name;
        Statement st = connection.createStatement();
        ResultSet res = st.executeQuery(sqlQuery);

        return null;
    }
}
