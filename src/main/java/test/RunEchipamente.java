/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:15
 * Project Name : Rsvti Mihnea 5.09
 */
package test;

import model.Echipamente;
import service.EchipamenteService;

import java.util.ArrayList;
import java.util.List;

public class RunEchipamente {

    static EchipamenteService echipamenteService = new EchipamenteService();

    public static void main(String[] args) {
        //userFindId();
        //findAll();
        addTableEchipamente();
        updateEchipamente();
    }

    private static void userFindId() {
        Echipamente echipamente = (Echipamente) echipamenteService.findById(2, Echipamente.class);
        System.out.println(echipamente);
    }

    private static void findAll() {
        List<Echipamente> echipamentes = echipamenteService.findAll(Echipamente.class);
        for (Echipamente echipamente : echipamentes) {
            System.out.println(echipamente);
        }
    }

    private static void updateEchipamente() {
        Echipamente echipamente = (Echipamente) echipamenteService.findById(2, Echipamente.class);
        echipamente.setTipEchipament("Cornel2");
        echipamente.setNrSerie("01012005");
        echipamenteService.updateEchipamente(echipamente);
        System.out.println(echipamente);
    }

    private static void addTableEchipamente() {

        Echipamente echipamente1 = new Echipamente();
        // echipamente1.setEchipamenteId(1); // autoincrement
        echipamente1.setTipEchipament("stivuitor");
        echipamente1.setNrSerie("111122233");
        echipamenteService.addEchipamente(echipamente1);

        System.out.println(echipamente1);

        List<Echipamente> echipamenteList = new ArrayList();
        echipamenteList.add(echipamente1);
    }
}
