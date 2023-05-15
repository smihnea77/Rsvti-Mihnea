/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 20:45
 * Project Name : Rsvti
 */
package service;

import config.DatabaseUtils;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserService extends DatabaseUtils {
    DatabaseUtils<User> userServiceDatabaseUtils = new DatabaseUtils<>();

    public void addUser(User user) {
        userServiceDatabaseUtils.add(user);
    }

    public void updateUser(User user) {
        userServiceDatabaseUtils.update(user);
    }

    public void deleteUser(User user) {
        userServiceDatabaseUtils.delete(user);
    }

    public void deleteByFirstName(String firstName) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("delete from User where firstname like :firstName", null);
                query.setParameter("firstName", "%" + firstName + "%");
                query.executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut sterge: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }
}
