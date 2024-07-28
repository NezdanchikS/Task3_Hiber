package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу
        userService.saveUser("John", "Doe", (byte) 30);
        System.out.println("User с именем — John добавлен в базу данных");
        userService.saveUser("Jane", "Doe", (byte) 25);
        System.out.println("User с именем — Jane добавлен в базу данных");
        userService.saveUser("Jim", "Beam", (byte) 35);
        System.out.println("User с именем — Jim добавлен в базу данных");
        userService.saveUser("Jack", "Daniels", (byte) 40);
        System.out.println("User с именем — Jack добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}

