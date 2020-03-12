package users;

import com.sun.org.apache.bcel.internal.Repository;
import utils.PasswordUtil;

import java.util.Optional;

public class UserService {

  private UserRepository userRepository=new UserRepository();

    boolean addUser(User user) {

        Optional<User> userByLogin = userRepository.getByKey(user.getLogin());
        Optional<User> userByEmail = userRepository.getUserByEmail(user.getEmail());
        if (userByLogin.isPresent() || userByEmail.isPresent()) {
            return false;
        } else {
            String encryptedPassword = PasswordUtil.hashPassword(user.getPassword());
            user.setPassword(encryptedPassword);
            userRepository.addToRepository(user);
            return true;
        }
    }

    Optional<User> getUserByLoginAndPassword(String login, String password) {
        Optional<User> userByLoginAndPassword = userRepository.getUserByLoginAndPassword(login, password);

        return userByLoginAndPassword;

    }

}
