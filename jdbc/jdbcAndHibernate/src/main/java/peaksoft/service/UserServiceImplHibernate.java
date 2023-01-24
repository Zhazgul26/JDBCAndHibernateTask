package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImplHibernate implements UserService{
    private   final UserDao userDao = new UserDaoHibernateImpl();
    @Override
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
userDao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {

    }
}
