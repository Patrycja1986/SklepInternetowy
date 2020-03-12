package users;

import users.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Repository <K,V> {

    private K key;
    private V value;
    private Map<K, V> map;

    public Repository(Map<K,V> map){
        this.map=map;
    }

    public Map<K, V> getMap() {
        return map;
    }

    public Optional<V> getByKey(K key) {
        return Optional.ofNullable(map.get(key));
    }

    public void addToRepository(V value) {

        User user = (User) value;
        K key = (K) user.getLogin();
        map.put(key, value);


    }


}
