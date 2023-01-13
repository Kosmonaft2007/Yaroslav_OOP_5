package service;


import model.User;

public interface DataService<U extends User> {

    void addUser(U user);

    void save(String path);

    void load(String path);
}
