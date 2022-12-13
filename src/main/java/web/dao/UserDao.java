package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> listUsers();
}
