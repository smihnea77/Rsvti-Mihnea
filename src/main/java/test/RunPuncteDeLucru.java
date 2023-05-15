/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:14
 * Project Name : Rsvti Mihnea 5.09
 */
package test;

import model.PuncteDeLucru;
import service.PuncteDeLucruService;

import java.util.ArrayList;
import java.util.List;

public class RunPuncteDeLucru {

    static PuncteDeLucruService puncteDeLucruService = new PuncteDeLucruService();

    public static void main(String[] args) {
        //userFindId();
        //findAll();
        updatePuncteDeLucru();
        addTablePuncteDeLucru();
    }

    private static void firmaFindId() {
        PuncteDeLucru puncteDeLucru = (PuncteDeLucru) puncteDeLucruService.findById(2, PuncteDeLucru.class);
        System.out.println(puncteDeLucru);
    }

    private static void findAll() {
        List<PuncteDeLucru> puncteDeLucrus = puncteDeLucruService.findAll(PuncteDeLucru.class);
        for (PuncteDeLucru puncteDeLucru : puncteDeLucrus) {
            System.out.println(puncteDeLucru);
        }
    }

    private static void updatePuncteDeLucru() {
        PuncteDeLucru puncteDeLucru = (PuncteDeLucru) puncteDeLucruService.findById(2, PuncteDeLucru.class);
        puncteDeLucru.setJudet("L");
        puncteDeLucru.setLocalitate("");
        puncteDeLucruService.updatePuncteDeLucru(puncteDeLucru);
        System.out.println(puncteDeLucru);
    }

    private static void addTablePuncteDeLucru() {

        // Punct 1
        PuncteDeLucru punct1 = new PuncteDeLucru();
        punct1.setLocalitate("Brasov");
        punct1.setStrada("Zizinului");
        punct1.setNumar("10");
        punct1.setJudet("Brasov");
        puncteDeLucruService.addPuncteDeLucru(punct1);
        System.out.println(punct1);

        // Punct 2
        PuncteDeLucru punct2 = new PuncteDeLucru();
        punct2.setLocalitate("Bucuresti");
        punct2.setStrada("Radu Voda");
        punct2.setNumar("2");
        punct2.setJudet("Sector 4");
        puncteDeLucruService.addPuncteDeLucru(punct2);
        System.out.println(punct2);

        List<PuncteDeLucru> puncteDeLucruList = new ArrayList();
        puncteDeLucruList.add(punct1);
        puncteDeLucruList.add(punct2);
        System.out.println(puncteDeLucruList);
    }
}
