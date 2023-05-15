/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:16
 * Project Name : Rsvti Mihnea 5.09
 */
package test;

import model.Autorizari;
import service.AutorizariService;

import java.util.ArrayList;
import java.util.List;

public class RunAutorizari {

    static AutorizariService autorizariService = new AutorizariService();

    public static void main(String[] args) {
        //userFindId();
        //findAll();
        addTableAutorizari();
        updateAutorizari();
    }

    private static void userFindId() {
        Autorizari autorizari = (Autorizari) autorizariService.findById(2, Autorizari.class);
        System.out.println(autorizari);
    }

    private static void findAll() {
        List<Autorizari> autorizaris = autorizariService.findAll(Autorizari.class);
        for (Autorizari autorizari : autorizaris) {
            System.out.println(autorizari);
        }
    }

    private static void updateAutorizari() {
        Autorizari autorizari = (Autorizari) autorizariService.findById(2, Autorizari.class);
        autorizari.setNrRaport("Cornel2");
        autorizari.setNrSerie("01012005");
        autorizariService.updateAutorizari(autorizari);
        System.out.println(autorizari);
    }

    private static void addTableAutorizari() {

        Autorizari autorizare1 = new Autorizari();
        autorizare1.setNrSerie("2345");
        autorizariService.addAutorizari(autorizare1);

        System.out.println(autorizare1);

        List<Autorizari> autorizariList = new ArrayList();
        autorizariList.add(autorizare1);

    }
}
