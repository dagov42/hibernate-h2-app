package com.hibernate.h;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Buyer buyer = session.get(Buyer.class, 1L);
            buyer.print();

            Buyer buyer2 = new Buyer();
            buyer2.setName("Bob");
            session.save(buyer2);
            buyer2.print();

            Product productBox = session.get(Product.class, 1L);
            productBox.print();

            for (int i = 0; i < 10; i++) {
                Product product = new Product();
                product.setName("Milk" + i);
                session.save(product);
                product.print();
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }
}
