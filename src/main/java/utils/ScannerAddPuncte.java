/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 14:56
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.PuncteDeLucru;

import java.util.Scanner;

public class ScannerAddPuncte {
    private Scanner scannerOption;

    public ScannerAddPuncte() {
        this.scannerOption = new Scanner(System.in);
    }

    public PuncteDeLucru scannAddPuncteDeLucru() {
        System.out.println("Introdu localitate punctului de lucru: ");
        String localitate = scannerOption.nextLine();

        System.out.println("Introdu strada: ");
        String strada = scannerOption.nextLine();

        System.out.println("Introdu numar: ");
        String numar = scannerOption.nextLine();

        System.out.println("Introdu judet sau sector: ");
        String judetOrSector = scannerOption.nextLine();


        PuncteDeLucru puncteDeLucru = new PuncteDeLucru();
        puncteDeLucru.setLocalitate(localitate);
        puncteDeLucru.setStrada(strada);
        puncteDeLucru.setNumar(numar);
        puncteDeLucru.setJudet(judetOrSector);

        return puncteDeLucru;
    }


}
