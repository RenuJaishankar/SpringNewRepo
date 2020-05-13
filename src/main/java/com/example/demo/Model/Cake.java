package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cake {

    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)


    private long id;
    private String name;
    private boolean frosted;

    public Cake(String name, boolean frosted) {
        this.name = name;
        this.frosted = frosted;
    }

    public Cake() {
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFrosted() {
        return frosted;
    }

    public void setFrosted(boolean frosted) {
        this.frosted = frosted;
    }


}
