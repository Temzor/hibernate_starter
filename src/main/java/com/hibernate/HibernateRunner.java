package com.hibernate;

import org.hibernate.cfg.Configuration;
import java.sql.SQLException;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {
        Configuration configuration = new Configuration();
        configuration.configure();

    }
}
