/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 16:19
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Firme;

import java.util.Scanner;

public class ScannerDeleteFirma {
    private Scanner scannerOption;

    public ScannerDeleteFirma() {
        this.scannerOption = new Scanner(System.in);
    }

    public Firme scannDeleteFirma() {
        System.out.println("Introdu denumirea companiei pe care doriti sa o stergeti: ");
        String denumireFirma = scannerOption.nextLine();

        Firme firma = new Firme();
        firma.setNumeFirma(denumireFirma);



        return firma;
    }
}
