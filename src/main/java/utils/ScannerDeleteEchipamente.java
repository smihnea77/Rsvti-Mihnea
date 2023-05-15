/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 18:46
 * Project Name : Rsvti Mihnea 5.09
 */
package utils;

import model.Echipamente;

import java.util.Scanner;

public class ScannerDeleteEchipamente {
    private Scanner scannerOption;

    public ScannerDeleteEchipamente() {
        this.scannerOption = new Scanner(System.in);
    }

    public Echipamente scannDeleteEchipamente() {
        System.out.println("Introduceti tipul echipamentului pe care doriti sa o stergeti: ");
        String tipEchipament = scannerOption.nextLine();

        Echipamente echipamente = new Echipamente();
        echipamente.setTipEchipament(tipEchipament);

        return echipamente;
    }
}
