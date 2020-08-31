package com.ohmybug.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.security.auth.login.Configuration;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName:   jdbcUtils
 * Data:        2020/7/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class JdbcUtils {
    private static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            InputStream stream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(stream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

    public static void close(Connection connection){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
