/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 15:36
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Echipamente;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerAddEchipamente {
    private Scanner scannerOption;

    public ScannerAddEchipamente() {
        this.scannerOption = new Scanner(System.in);
    }

    public Echipamente scannAddEchipamente() {
        System.out.println("Introdu tip echipament: ");
        String tipEchipament = scannerOption.nextLine();

        System.out.println("Introdu modelul echipamentului: ");
        String modelEchipament = scannerOption.nextLine();

        System.out.println("Introdu nr de serie: ");
        String nrSerie = scannerOption.nextLine();

        System.out.println("Introdu anul de fabricatie: ");
        LocalDate anFabricatie = LocalDate.parse(scannerOption.nextLine());

        System.out.println("Introdu sarcina nominala: ");
        Integer sarcinaNominala = scannerOption.nextInt();

        Echipamente echipamente = new Echipamente();
        echipamente.setTipEchipament(tipEchipament);
        echipamente.setModelEchipament(modelEchipament);
        echipamente.setNrSerie(nrSerie);
        echipamente.setAnFabricatie(anFabricatie);
        echipamente.setSarcinaNominala(sarcinaNominala);

        return echipamente;
    }
}
