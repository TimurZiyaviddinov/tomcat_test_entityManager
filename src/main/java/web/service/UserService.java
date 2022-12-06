package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void updateUser(User user);
    void addUser(User user);

    User getUserById(int id);

    void deleteUser(User user);
}
