package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

public interface MainRepo {
    void saveName(String name);
    List<String> getList(String name) throws SQLException;
}
