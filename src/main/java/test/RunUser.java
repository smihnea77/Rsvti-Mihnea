/**
 * Created by Mihnea-Alexandru Serban
 * Date : 05.09.2022
 * Time : 11:03
 * Project Name : Rsvti Mihnea 5.09
 */
package test;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class RunUser {

    static UserService userService = new UserService();

    public static void main(String[] args) {
        //userFindId();
        //findAll();
        addUser();
        deleteUser();
        //updateUser();
    }

    private static void userFindId() {
        User user = (User) userService.findById(2, User.class);
        System.out.println(user);
    }

    private static void findAll() {
        List<User> users = userService.findAll(User.class);
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void updateUser() {
        User user = (User) userService.findById(2, User.class);
        user.setFirstname("Mihnea2");
        user.setLastname("Serban2");
        userService.updateUser(user);
        System.out.println(user);
    }

    private static void deleteUser() {
        userService.deleteByFirstName("Mihnea");

    }

    private static void addUser() {

        // User 1
        User user1 = new User();
        user1.setFirstname("Michael");
        user1.setLastname("Schwarz");
        user1.setMail("michael@rsvti.ro");
        user1.setUsername("Michael");
        user1.setPassword("1211");
        userService.addUser(user1);
        System.out.println(user1);

        // delete User 1
        userService.deleteUser(user1);
        System.out.println(user1);

        // User 2
        User user2 = new User();
        user2.setFirstname("Jakob");
        user2.setLastname("Schmidt");
        user2.setMail("jakob@rsvti.ro");
        user2.setUsername("Jakob");
        user2.setPassword("2221");
        userService.addUser(user2);
        System.out.println(user2);

        // User 3
        User user3 = new User();
        user3.setFirstname("Susanne");
        user3.setLastname("Schneider");
        user3.setMail("susanne@rsvti.ro");
        user3.setUsername("Susanne");
        user3.setPassword("2223");
        userService.addUser(user3);

        // List
        List<User> userList = new ArrayList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println(userList);

    }
}
