/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 19:18
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Autorizari;

import java.util.Scanner;

public class ScannerDeleteAutorizari {
    private Scanner scannerOption;

    public ScannerDeleteAutorizari() {
        this.scannerOption = new Scanner(System.in);
    }

    public Autorizari scannDeleteAutorizari() {
        System.out.println("Introduceti numarul de serie al autorizatiei companiei pe care doriti sa o stergeti: ");
        String nrSerie = scannerOption.nextLine();

        Autorizari autorizari = new Autorizari();
        autorizari.setNrSerie(nrSerie);

        return autorizari;
    }
}
