package com.elmansouriadil.swipe.myapplication;

import io.realm.RealmObject;

public class Etudiant {

    public Etudiant(){}
    Etudiant(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
