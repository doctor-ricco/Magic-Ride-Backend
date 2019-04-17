package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String tagName;

    @ManyToMany
    private List<Guide> users;


}
