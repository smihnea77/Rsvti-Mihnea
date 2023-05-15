/**
 * Created by Mihnea-Alexandru Serban
 * Date : 01.09.2022
 * Time : 20:28
 * Project Name : Rsvti
 */
package login;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        recordYourAccount();
    }

    public static void recordYourAccount() {
        Scanner username = new Scanner(System.in);
        System.out.println("Enter your username or mail: ");
        String user = username.nextLine();
        System.out.println("Enter your password: ");
        String password = username.nextLine();
        System.out.println("Welcome " + user);
    }
}
