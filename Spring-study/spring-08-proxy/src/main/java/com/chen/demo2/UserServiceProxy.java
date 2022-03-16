package com.chen.demo2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        this.userService.add();
    }

    @Override
    public void update() {
        log("updated");
        this.userService.update();
    }

    @Override
    public void delete() {
        log("delete");
        this.userService.delete();
    }

    @Override
    public void query() {
        log("query");
        this.userService.query();
    }

    private void log(String msg) {
        System.out.println("Execute " + msg + " method");
    }
}
