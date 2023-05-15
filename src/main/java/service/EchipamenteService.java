/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 19:25
 * Project Name : Rsvti
 */
package service;

import config.DatabaseUtils;
import model.Echipamente;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EchipamenteService extends DatabaseUtils {
    DatabaseUtils<Echipamente> echipamenteDatabaseUtils = new DatabaseUtils<>();

    public void addEchipamente(Echipamente echipamente) {
        echipamenteDatabaseUtils.add(echipamente);
    }

    public void updateEchipamente(Echipamente echipamente) {
        echipamenteDatabaseUtils.update(echipamente);
    }

    public void deleteEchipamente(Echipamente echipamente) {
        echipamenteDatabaseUtils.delete(echipamente);
    }

    public void deleteByTipEchipament(Echipamente echipamente) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("delete from Echipamente where tipEchipament like :tipEchipament", null);
                query.setParameter("tipEchipament", "%" + echipamente.getTipEchipament() + "%");
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
