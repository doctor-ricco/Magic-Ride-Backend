package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.services;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model.Guide;

import java.util.ArrayList;
import java.util.List;

public class GuideService implements Service<Guide> {

    private List<Guide> guideList = new ArrayList<>();

    @Override
    public Guide get(Integer id) {
        return guideList.get(id);
    }

    @Override
    public List<Guide> getAll() {
        return guideList;
    }

    @Override
    public void add(Guide guide) {
        guideList.add(guide);
    }

    @Override
    public void remove(Integer id) {
        guideList.remove(id);
    }

    @Override
    public byte[] getPhoto(Integer id) {
        return new byte[0];
    }
}
