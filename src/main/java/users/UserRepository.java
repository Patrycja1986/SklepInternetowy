package users;

import utils.PasswordUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository extends Repository<String, User> {

    private static Map<String,User> map=new HashMap<>();

    public UserRepository(){
        super(map);
    }

    public Optional<User> getUserByEmail(String email) {
        return map.values().stream().filter(c -> c.getEmail().contains(email)).findFirst();
    }

    public Optional<User> getUserByLoginAndPassword(String login, String password) {
        return map.values().stream().filter(c -> c.getLogin().equals(login) && PasswordUtil.checkPassword(password, c.getPassword())).findFirst();
    }
}
