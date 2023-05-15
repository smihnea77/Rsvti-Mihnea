/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 14:35
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Firme;

import java.util.Scanner;

public class ScannerAddFirma {

    private Scanner scannerOption;

    public ScannerAddFirma() {
        this.scannerOption = new Scanner(System.in);
    }

    public Firme scannAddFirma() {
        System.out.println("Introdu denumirea companiei: ");
        String denumireFirma = scannerOption.nextLine();

        System.out.println("Introdu numarul de inregistrare la Registrul Comertului: ");
        String reg = scannerOption.nextLine();

        System.out.println("Introdu codul fiscal al companiei CUI: ");
        Integer cui = scannerOption.nextInt();

        Firme firma = new Firme();
        firma.setNumeFirma(denumireFirma);
        firma.setCui(cui);
        firma.setRecom(reg);

        return firma;
    }
}
