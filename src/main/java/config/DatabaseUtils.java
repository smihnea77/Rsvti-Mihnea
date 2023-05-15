/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 19:21
 * Project Name : Rsvti
 */
package config;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Properties;

public class DatabaseUtils<T> {
    protected static SessionFactory sessionFactory;

    public DatabaseUtils() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/rsvti1");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "Java2022");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            settings.put(Environment.SHOW_SQL, true);
            settings.put(Environment.FORMAT_SQL, true);
            settings.put(Environment.HBM2DDL_AUTO, "update");

            configuration.setProperties(settings); // facem legatura intre configuration si properties

            configuration.addAnnotatedClass(Firme.class);
            configuration.addAnnotatedClass(PuncteDeLucru.class);
            configuration.addAnnotatedClass(Echipamente.class);
            configuration.addAnnotatedClass(Autorizari.class);
            configuration.addAnnotatedClass(User.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
    }

    public void add(T object) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.persist(object);
                transaction.commit(); // ca sa fie salvata in DB (database?)
            } catch (Exception e) {
                System.out.println("Nu am putut adauga datele in tabel pentru ca: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }

    public void delete(T object) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.remove(object);
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut sterge: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }

    public T update(T object) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            T updatedT = null;
            try {
                transaction = session.beginTransaction();
                updatedT = session.merge(object);
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut face update: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
            return updatedT;
        }
    }

    public T findById(long id, Class<T> entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction;
            T result;
            try {
                transaction = session.beginTransaction();
                result = session.get(entity, id);
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu s-a putut face findById pentru ca: " + e);
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            return result;
        }
    }

    public List<T> findAll(Class<T> entity) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<T> query = cb.createQuery(entity);
            Root<T> root = query.from(entity);
            CriteriaQuery<T> all = query.select(root);
            TypedQuery<T> allQuery = session.createQuery(all);
            return allQuery.getResultList();
        }
    }

       /*
       public void deleteByColumn(T object) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        int result = session.createStoredProcedureQuery("delete from " + object.getClass().getName() + " where firstName='Dumitru'" ).executeUpdate();
        transaction.commit();
    }
    */
}

