package users;

import java.util.Optional;

public interface IUserRepository {
    void addUser(User user);
    Optional<User> getUserByLogin(String login);
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserByLoginAndPassword(String login,String password);


}
