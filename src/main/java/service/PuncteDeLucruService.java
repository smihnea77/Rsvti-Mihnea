/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 19:24
 * Project Name : Rsvti
 */
package service;

import config.DatabaseUtils;
import model.PuncteDeLucru;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PuncteDeLucruService extends DatabaseUtils{
    DatabaseUtils<PuncteDeLucru> puncteDeLucruDatabaseUtils = new DatabaseUtils<>();

    public void addPuncteDeLucru(PuncteDeLucru puncteDeLucru) {
        puncteDeLucruDatabaseUtils.add(puncteDeLucru);
    }

    public void updatePuncteDeLucru(PuncteDeLucru puncteDeLucru) {
        puncteDeLucruDatabaseUtils.update(puncteDeLucru);
    }

    public void deletePuncteDeLucru(PuncteDeLucru puncteDeLucru) {
        puncteDeLucruDatabaseUtils.delete(puncteDeLucru);
    }

    public void deleteBylocalitate(PuncteDeLucru puncteDeLucru) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("delete from PuncteDeLucru where localitate like :localitate", null);
                query.setParameter("localitate", "%" + puncteDeLucru.getLocalitate() + "%");
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
