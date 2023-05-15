/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 15:42
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Autorizari;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerAddAutorizari {
    private Scanner scannerOption;

    public ScannerAddAutorizari() {
        this.scannerOption = new Scanner(System.in);
    }

    public Autorizari scannAddAutorizari() {
        System.out.println("Introdu numar de serie autorizare: ");
        String nrSerie = scannerOption.nextLine();

        System.out.println("Introdu data autorizarii echipamentului: ");
        LocalDate dataAutorizare = LocalDate.parse(scannerOption.nextLine());

        System.out.println("Introdu data scadentei echipamentului: ");
        LocalDate scadenta = LocalDate.parse(scannerOption.nextLine());

        System.out.println("Introdu numar raport autorizare: ");
        String nrRaport = scannerOption.nextLine();

        Autorizari autorizari = new Autorizari();
        autorizari.setNrSerie(nrSerie);
        autorizari.setDataAutorizare(dataAutorizare);
        autorizari.setScadenta(scadenta);
        autorizari.setNrRaport(nrRaport);

        return autorizari;
    }
}
