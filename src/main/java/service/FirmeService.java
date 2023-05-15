/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 15:11
 * Project Name : Rsvti Mihnea 5.09
 */
package service;

import config.DatabaseUtils;
import model.Firme;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class FirmeService extends DatabaseUtils {

    DatabaseUtils<Firme> firmeDatabaseUtils = new DatabaseUtils<>();

    public void addFirme(Firme firme) {
        firmeDatabaseUtils.add(firme);
    }

    public void updateFirme(Firme firme) {
        firmeDatabaseUtils.update(firme);
    }

    public void deleteFirme(Firme firme) {
        firmeDatabaseUtils.delete(firme);
    }

    public void deleteByCompanyName(Firme firma) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("delete from Firme where numeFirma like :numeFirma", null);
                query.setParameter("numeFirma", "%" + firma.getNumeFirma() + "%");
                query.executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut sterge: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }

    public void updateByName(String oldName, String newName) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("update Firme set numeFirma = :newName where numeFirma = :oldName", null);
                query.setParameter("newName",  newName);
                query.setParameter("oldName",  oldName);
                query.executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut modifica: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }
}


