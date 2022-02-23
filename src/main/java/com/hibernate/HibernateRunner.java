package com.hibernate;

import com.hibernate.convertor.BirthdayConverter;
import com.hibernate.entity.Birthday;
import com.hibernate.entity.Role;
import com.hibernate.entity.User;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) {
//        BlockingDeque<Connection> pool = null;
//        Connection connection = pool.take();
//        SessionFactory

//        Connection connection = DriverManager
//                .getConnection("db.url", "db.username", "db.password");
//        Session
        Configuration configuration = new Configuration();
//        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
//        configuration.addAnnotatedClass(User.class);
        configuration.addAttributeConverter(new BirthdayConverter());
        configuration.registerTypeOverride(new JsonBinaryType());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            User user = User.builder()
                    .username("ivan@gmail1.com")
                    .firstname("Ivan")
                    .lastname("Ivanov")
                    .info("""
                            {
                                "name": "Ivan",
                                "id": 25
                            }
                            """)
                    .birthDate(new Birthday(LocalDate.of(2000, 1, 19)))
                    .role(Role.ADMIN)
                    .build();
            session.save(user);
            session.update(user);
            session.saveOrUpdate(user);
            session.delete(user);
            session.get(User.class, "ivan@gmail1.com");

            session.getTransaction().commit();
        }
    }












}