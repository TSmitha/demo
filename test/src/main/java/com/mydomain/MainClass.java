package com.mydomain;

import java.sql.Connection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;

import com.mydomain.model.Users;

public class MainClass {

	public static void main(String[] args) {
			 // Loading Session Factory and Querying
			Configuration configuration = (Configuration) new Configuration().configure("hibernate.cfg.xml");
			 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(((Configuration) configuration).getProperties()).build();
			 SessionFactory sessionFactory = ((Configuration) configuration).buildSessionFactory(serviceRegistry);

			 Session session = sessionFactory.openSession();
			 List<Users> userList = session.createQuery("select u from Users u").list();
			 System.out.println(userList);
			 session.close();
			}

}
