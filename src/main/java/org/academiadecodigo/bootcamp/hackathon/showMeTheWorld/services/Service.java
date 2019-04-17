package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.services;

import java.util.List;

public interface Service<T> {
    T get(Integer id);

    List<T> getAll();

    void add(T t);

    void remove(Integer id);

    byte[] getPhoto(Integer id);
}
