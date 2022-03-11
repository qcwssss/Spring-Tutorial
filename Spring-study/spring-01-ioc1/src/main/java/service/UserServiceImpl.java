package service;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserDaoMySQLImpl;
import dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
