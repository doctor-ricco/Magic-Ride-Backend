package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by codecadet on 17/04/2019.
 */
@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String language;

    @ManyToMany
    private List<Guide> users;

}
