/**
 * Created by Mihnea-Alexandru Serban
 * Date : 30.08.2022
 * Time : 19:25
 * Project Name : Rsvti
 */
package service;

import config.DatabaseUtils;
import model.Autorizari;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class AutorizariService extends DatabaseUtils{
    DatabaseUtils<Autorizari> autorizariDatabaseUtils = new DatabaseUtils<>();

    public void addAutorizari(Autorizari autorizari) {
        autorizariDatabaseUtils.add(autorizari);
    }

    public void updateAutorizari(Autorizari autorizari) {
        autorizariDatabaseUtils.update(autorizari);
    }

    public void deleteAutorizari(Autorizari autorizari) {
        autorizariDatabaseUtils.delete(autorizari);
    }

    public void deleteByNrSerie(Autorizari autorizari) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("delete from Autorizari where nrSerie like :nrSerie", null);
                query.setParameter("nrSerie", "%" + autorizari.getNrSerie() + "%");
                query.executeUpdate();
                transaction.commit();
            } catch (Exception e) {
                System.out.println("Nu am putut sterge: " + e);
                e.printStackTrace();
                if (transaction != null) transaction.rollback();
            }
        }
    }
    public void updateByName(String oldNrSerie, String newNrSerie) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Query<User> query = session.createQuery("update Autorizari set nrSerie = :newNrSerie where nrSerie = :oldNrSerie", null);
                query.setParameter("newNrSerie",  oldNrSerie);
                query.setParameter("oldNrSerie",  newNrSerie);
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
