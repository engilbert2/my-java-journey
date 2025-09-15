package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setId(101);
        a1.setAname("Navin");
        a1.setTech("Java");

        Configuration config = new Configuration();

        SessionFactory factory = null;

        Session session = factory.openSession();

        session.save(a1);


    }
}