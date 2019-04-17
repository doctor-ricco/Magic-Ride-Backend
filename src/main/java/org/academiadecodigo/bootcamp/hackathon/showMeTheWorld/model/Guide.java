package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by codecadet on 17/04/2019.
 */
public class Guide {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String username;

    private String password;

    private Integer rating;

    private byte[] photo;

    @ManyToMany
    private List<Language> languages;

    private List<Tags> tags;



}
