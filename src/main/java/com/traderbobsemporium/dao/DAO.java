package main.java.com.traderbobsemporium.dao;



import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aidan Stewart
 * @Year 2019
 * Copyright (c)
 * All rights reserved.
 */

public interface DAO<T> {
    T get(long id) throws SQLException;
    List<T> getAll() throws SQLException;
    void update(T t, String[] params) throws SQLException;
    void add(T t) throws SQLException;
    void delete(long id) throws SQLException;

}
