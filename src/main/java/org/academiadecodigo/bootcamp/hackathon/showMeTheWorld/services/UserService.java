package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.services;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Service<User>{

    private List<User> userList = new ArrayList<>();

    @Override
    public User get(Integer id) {
        return userList.get(id);
    }

    @Override
    public List getAll() {
        return userList;
    }

    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public void remove(Integer id) {
        userList.remove(id);
    }

    @Override
    public byte[] getPhoto(Integer id) {
        return new byte[0];
    }
}
