package org.academiadecodigo.bootcamp.hackathon.showMeTheWorld.model;

import javax.persistence.*;

/**
 * Created by codecadet on 17/04/2019.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String username;

    private String password;

    private Integer rating;

    private byte[] photo;


}
