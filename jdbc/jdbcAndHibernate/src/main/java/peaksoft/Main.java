package peaksoft;

import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // реализуйте алгоритм здесь
//
//
//        UserService userService = new UserServiceImpl();
//
//        userService.saveUser("Nurkyz", "Kasymova", (byte)20);
//        userService.saveUser("Zhazgul", "Sarybaeva", (byte) 19);
//        userService.saveUser("Madina", "Musaeva", (byte) 16);
//        userService.saveUser("Erjigit", "Kalmyrzaev", (byte) 18);
//
//        userService.createUsersTable();

        /* System.out.println(userService.getAllUsers());*/

        //userService.cleanUsersTable();

        //userService.dropUsersTable();

        UserServiceImpl service = new UserServiceImpl();

        service.createUsersTable();

        System.out.println( "<<<COMMANDS>>>\n"+
                "1 button-> createUsersTable\n" +
                "2 button-> dropUsersTable\n" +
                "3 button-> saveUser\n" +
                "4 button-> removeUserById\n" +
                "5 button-> getAllUsers\n" +
                "6 button-> cleanUsersTable\n");

        while (true){
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    service.createUsersTable();
                    break;
                case 2:
                    service.dropUsersTable();
                    break;
                case 3:
                    service.saveUser("Zhazgul", "Zhoroeva", (byte) 19);
                    break;
                case 4:
                    service.removeUserById(1);
                    break;
                case 5:
                    service.getAllUsers();
                    break;
                case 6:
                    service.cleanUsersTable();
                    break;
                default:
                    System.out.println("Your method is complete!");
            }
        }

    }
    }

