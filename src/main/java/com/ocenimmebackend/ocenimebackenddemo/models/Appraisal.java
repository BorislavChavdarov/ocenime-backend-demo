package com.ocenimmebackend.ocenimebackenddemo.models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Appraisal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String info;

    public Appraisal() {
    }

    public Appraisal(String info) {
        this.info = info;
    }

    public Appraisal(Long id, String info) {
        this.id = id;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Appraisal{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
