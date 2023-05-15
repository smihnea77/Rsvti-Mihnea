/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 16:59
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.PuncteDeLucru;

import java.util.Scanner;

public class ScannerDeletePuncteDeLucru {

    private Scanner scannerOption;

    public ScannerDeletePuncteDeLucru() {
        this.scannerOption = new Scanner(System.in);
    }

    public PuncteDeLucru scannDeletePuncteDeLucru() {
        System.out.println("Introdu localitatea companiei pe care doriti sa o stergeti: ");
        String localitate = scannerOption.nextLine();

        PuncteDeLucru puncteDeLucru = new PuncteDeLucru();
        puncteDeLucru.setLocalitate(localitate);

        return puncteDeLucru;
    }
}
