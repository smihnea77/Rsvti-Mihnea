/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 19:52
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import java.util.Scanner;

public class ScannerUpdateAutorizari {
    private Scanner scannerOption;

    public ScannerUpdateAutorizari() {
        this.scannerOption = new Scanner(System.in);
    }

    public String[] scannUpdateAutorizari() {
        System.out.println("Introdu numarul de serie pe care doriti sa il modificati: ");
        String oldNrSerie = scannerOption.nextLine();
        String newNrSerie = scannerOption.nextLine();

        String[] on = new String[2];
        on[0] = oldNrSerie;
        on[1] = newNrSerie;

        return on;
    }
}
