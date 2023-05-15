import model.User;
import service.*;
import utils.*;

import java.util.Scanner;

import static login.Register.recordYourAccount;

/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:38
 * Project Name : Rsvti Mihnea 5.09
 */

public class Main {
    public static void main(String[] args) {
        recordYourAccount();
        selectMenu();
    }

    private static void selectMenu() {
        System.out.println(("-------------------------------"));
        System.out.println("Alege ce doresti sa faci in baza de date");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a modifica tabele");
        System.out.println("Apasati tasta 2 pentru cautare");

        Scanner scannerOption = new Scanner(System.in);
        int selectMenu = scannerOption.nextInt();

        while (selectMenu == 1) {
            switch (selectMenu) {
                case 1:
                    modifyDataBase();
                    break;
                case 2:
                    searchTable();
//                    searchDataBase();
                    break;
            }
            break;
        }
    }

    public static void modifyDataBase() {
        System.out.println(("-------------------------------"));
        System.out.println("Ai ales sa modifici baza de date");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a adauga date in tabele");
        System.out.println("Apasati tasta 2 pentru a sterge date din tabele");
        System.out.println("Apasati tasta 3 pentru a modifica date din tabele");

        Scanner scannerOption = new Scanner(System.in);
        int selectActionTable = scannerOption.nextInt();

        switch (selectActionTable) {
            case 1:
                System.out.println("Ai ales sa adaugi informatii in tabele");
                addDateTable();
                break;
            case 2:
                System.out.println("Ai ales sa stergi informatii in tabele");
                deleteTable();
                break;
            case 3:
                System.out.println("Ai ales sa modifici informatii in tabele");
                modifyTable();
                break;
        }
    }

    private static void modifyTable() {
        System.out.println("Apasati tasta 1 pentru modificare din Firme");
        System.out.println("Apasati tasta 2 pentru modificare din Puncte de lucru");
        System.out.println("Apasati tasta 3 pentru modificare din Echipamente");
        System.out.println("Apasati tasta 4 pentru modificare din Autorizari");

        Scanner scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Vei modifica informatii in tabela Firme");
                modifyDateTableFirme();
                break;
            case 2:
                System.out.println("Vei modifica informatii in tabela Puncte de lucru");
//                    modifyDateTablePuncteDeLucru();
                break;
            case 3:
                System.out.println("Vei modifica informatii in tabela Echipamente");
//                    modifyDateTableEchipamente();
                break;
            case 4:
                System.out.println("Vei modifica informatii in tabela Autorizari");
                    modifyDateTableAutorizari();
                break;
        }
    }

    private static void modifyDateTableAutorizari() {
        AutorizariService autorizariService = new AutorizariService();
        ScannerUpdateAutorizari readFirma = new ScannerUpdateAutorizari();
        String[] scannedValues = readFirma.scannUpdateAutorizari();

        autorizariService.updateByName(scannedValues[0], scannedValues[1]);

        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a modifica o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Mofifica o noua companie.");
                modifyDateTableAutorizari();
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    private static void modifyDateTableFirme() {
        FirmeService firmeService = new FirmeService();
        ScannerUpdateFirma readFirma = new ScannerUpdateFirma();
        String[] scannedValues = readFirma.scannUpdateFirma();

        firmeService.updateByName(scannedValues[0], scannedValues[1]);

        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a modifica o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Mofifica o noua companie.");
                modifyDateTableFirme();
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    public static void deleteTable() {
        System.out.println("Apasati tasta 1 pentru stergere din Firme");
        System.out.println("Apasati tasta 2 pentru stergere din Puncte de lucru");
        System.out.println("Apasati tasta 3 pentru stergere din Echipamente");
        System.out.println("Apasati tasta 4 pentru stergere din Autorizari");

        Scanner scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

//        while (selectTable == 1) {
        switch (selectTable) {
            case 1:
                System.out.println("Vei sterge informatii in tabela Firme");
                deleteDateTableFirme();
                break;
            case 2:
                System.out.println("Vei sterge informatii in tabela Puncte de lucru");
                deleteDateTablePuncteDeLucru();
                break;
            case 3:
                System.out.println("Vei sterge informatii in tabela Echipamente");
                deleteDateTableEchipamente();
                break;
            case 4:
                System.out.println("Vei sterge informatii in tabela Autorizari");
                deleteDateTableAutorizari();
                break;
        }
//            break;
//        }

    }

    private static void deleteDateTableFirme() {
        FirmeService firmeService = new FirmeService();
        ScannerDeleteFirma readFirma = new ScannerDeleteFirma();
        firmeService.deleteByCompanyName(readFirma.scannDeleteFirma());

        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a sterge o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Sterge o noua companie.");
                firmeService.deleteFirme(readFirma.scannDeleteFirma());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    private static void deleteDateTablePuncteDeLucru() {
        PuncteDeLucruService puncteDeLucruService = new PuncteDeLucruService();
        ScannerDeletePuncteDeLucru readPuncteDeLucru = new ScannerDeletePuncteDeLucru();
        puncteDeLucruService.deleteBylocalitate(readPuncteDeLucru.scannDeletePuncteDeLucru());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai stergi o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a stergi o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();


        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                puncteDeLucruService.deletePuncteDeLucru(readPuncteDeLucru.scannDeletePuncteDeLucru());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    private static void deleteDateTableEchipamente() {
        EchipamenteService echipamenteService = new EchipamenteService();
        ScannerDeleteEchipamente readEchipamente = new ScannerDeleteEchipamente();
        echipamenteService.deleteByTipEchipament(readEchipamente.scannDeleteEchipamente());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai stergi o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a sterge o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                echipamenteService.deleteEchipamente(readEchipamente.scannDeleteEchipamente());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    private static void deleteDateTableAutorizari() {
        AutorizariService autorizariService = new AutorizariService();
        ScannerDeleteAutorizari readAutorizari = new ScannerDeleteAutorizari();
        autorizariService.deleteByNrSerie(readAutorizari.scannDeleteAutorizari());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai stergi o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a sterge o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();


        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                autorizariService.deleteAutorizari(readAutorizari.scannDeleteAutorizari());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    public static void addDateTable() {
        System.out.println(("-------------------------------"));
        System.out.println("Alege tabela pe care doresti sa o modifici");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a Firme");
        System.out.println("Apasati tasta 2 pentru a Puncte de lucru");
        System.out.println("Apasati tasta 3 pentru a Echipamente");
        System.out.println("Apasati tasta 4 pentru a Autorizari");

        Scanner scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Vei adauga informatii in tabela Firme");
                addDateTableFirme();
                break;
            case 2:
                System.out.println("Vei adauga informatii in tabela Puncte de lucru");
                addDateTablePuncteDeLucru();
                break;
            case 3:
                System.out.println("Vei adauga informatii in tabela Echipamente");
                addDateTableEchipamente();
                break;
            case 4:
                System.out.println("Vei adauga informatii in tabela Autorizari");
                addDateTableAutorizari();
                break;
        }
    }

    public static void addDateTableFirme() {
        FirmeService firmeService = new FirmeService();
        ScannerAddFirma readFirma = new ScannerAddFirma();
        firmeService.addFirme(readFirma.scannAddFirma());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a introduce o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                firmeService.addFirme(readFirma.scannAddFirma());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    public static void addDateTablePuncteDeLucru() {
        PuncteDeLucruService puncteDeLucruService = new PuncteDeLucruService();
        ScannerAddPuncte readPuncteDeLucru = new ScannerAddPuncte();
        puncteDeLucruService.addPuncteDeLucru(readPuncteDeLucru.scannAddPuncteDeLucru());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a introduce un nou punct de lucru");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

        switch (selectTable) {
            case 1:
                System.out.println("Adauga nou punct de lucru.");
                puncteDeLucruService.addPuncteDeLucru(readPuncteDeLucru.scannAddPuncteDeLucru());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    public static void addDateTableEchipamente() {
        EchipamenteService echipamenteService = new EchipamenteService();
        ScannerAddEchipamente readEchipamente = new ScannerAddEchipamente();
        echipamenteService.addEchipamente(readEchipamente.scannAddEchipamente());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a introduce o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();


        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                echipamenteService.addEchipamente(readEchipamente.scannAddEchipamente());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
    }

    public static void addDateTableAutorizari() {
        AutorizariService autorizariService = new AutorizariService();
        ScannerAddAutorizari readAutorizari = new ScannerAddAutorizari();
        autorizariService.addAutorizari(readAutorizari.scannAddAutorizari());


        System.out.println("Ai introdus toate datele companiei.");
        System.out.println(("-------------------------------"));
        System.out.println("Doresti sa mai introduci o societate?");
        System.out.println(("-------------------------------"));
        System.out.println("Apasati tasta 1 pentru a introduce o noua firma");
        System.out.println("Apasati tasta 2 pentru a te reintoarce in meniul principal");
        System.out.println("Apasati tasta 3 pentru a inchide sesiunea curenta");

        var scannerOption = new Scanner(System.in);
        int selectTable = scannerOption.nextInt();

//        while (selectTable == 1) {
        switch (selectTable) {
            case 1:
                System.out.println("Adauga noua companie.");
                autorizariService.addAutorizari(readAutorizari.scannAddAutorizari());
                break;
            case 2:
                System.out.println("Te-ai reintors in meniul principal");
                System.out.println(("-------------------------------"));
                selectMenu();
                break;
            case 3:
                System.out.println("Multumim pentru vizita!");
                break;
        }
//            break;
//        }
    }

    private static void searchTable() {
        UserService userService = new UserService();


        userService.findById(2, User.class);
        System.out.println("Valoarea gasita pentru findByID: 2 este: " + "............");


    }
}
