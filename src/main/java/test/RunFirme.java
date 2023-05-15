/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:17
 * Project Name : Rsvti Mihnea 5.09
 */
package test;

import model.Firme;
import service.FirmeService;

import java.util.ArrayList;
import java.util.List;

public class RunFirme {
    static FirmeService firmeService = new FirmeService();

    public static void main(String[] args) {
        //userFindId();
        //findAll();
        addTableFirme();
        updateFirme();
    }

    private static void firmaFindId() {
        Firme firme = (Firme) firmeService.findById(2, Firme.class);
        System.out.println(firme);
    }

    private static void findAll() {
        List<Firme> firmes = firmeService.findAll(Firme.class);
        for (Firme firme : firmes) {
            System.out.println(firme);
        }
    }

    private static void updateFirme() {
        Firme firme = (Firme) firmeService.findById(2, Firme.class);
        firme.setNumeFirma("Cereale SRL");
        firme.setCui(109242);
        firmeService.updateFirme(firme);
        System.out.println(firme);
    }

    private static void addTableFirme() {
        FirmeService firme = new FirmeService();

        // Firma 1
        Firme firma1 = new Firme();
        firma1.setNumeFirma("Asisco Tehnic SRL");
        firma1.setCui(22280483);
        firma1.setRecom("J08/46/2010");
        firme.addFirme(firma1);
        System.out.println(firma1);

        // Firma 2
        Firme firma2 = new Firme();
        firma1.setNumeFirma("Caramida SRL");
        firma1.setCui(22280483);
        firma1.setRecom("J20/34/2010");
        firme.addFirme(firma2);
        System.out.println(firma2);

        List<Firme> firmeList = new ArrayList();
        firmeList.add(firma1);
        firmeList.add(firma2);
        System.out.println(firmeList);
    }
}
