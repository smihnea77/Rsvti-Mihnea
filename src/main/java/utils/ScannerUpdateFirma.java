/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 17:10
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import java.util.Scanner;

public class ScannerUpdateFirma {
    private Scanner scannerOption;

    public ScannerUpdateFirma() {
        this.scannerOption = new Scanner(System.in);
    }

    public String[] scannUpdateFirma() {
        System.out.println("Introdu numele companiei pe care doriti sa il modificati: ");
        String oldName = scannerOption.nextLine();
        String newName = scannerOption.nextLine();

        String[] on = new String[2];
        on[0] = oldName;
        on[1] = newName;

        return on;
    }
}
