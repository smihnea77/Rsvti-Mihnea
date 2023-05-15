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
        user.setFirstname("Cornel2");
        user.setLastname("Lupu2");
        userService.updateUser(user);
        System.out.println(user);
    }

    private static void deleteUser() {
        userService.deleteByFirstName("Mihnea");

    }

    private static void addUser() {

        // User 1
        User user1 = new User();
        user1.setFirstname("Mihai");
        user1.setLastname("Dumitru");
        user1.setMail("mihai@sda.ro");
        user1.setUsername("Mihai");
        user1.setPassword("1111");
        userService.addUser(user1);
        System.out.println(user1);

        // delete User 1
        userService.deleteUser(user1);
        System.out.println(user1);

        // User 2
        User user2 = new User();
        user2.setFirstname("Cornel");
        user2.setLastname("Lupu");
        user2.setMail("cornel@sda.ro");
        user2.setUsername("Cornel");
        user2.setPassword("2222");
        userService.addUser(user2);
        System.out.println(user2);

        // User 3
        User user3 = new User();
        user3.setFirstname("Mihnea");
        user3.setLastname("Serban");
        user3.setMail("mihnea@sda.ro");
        user3.setUsername("Mihnea");
        user3.setPassword("2222");
        userService.addUser(user3);

        // List
        List<User> userList = new ArrayList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println(userList);

    }
}
