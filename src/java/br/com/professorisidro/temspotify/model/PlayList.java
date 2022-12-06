/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.professorisidro.temspotify.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PlayList implements Serializable{
    private int id;
    private String titulol;
    private List<Musica> musicas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulol() {
        return titulol;
    }

    public void setTitulol(String titulol) {
        this.titulol = titulol;
    }

    /**
     * @return the musicas
     */
    public List<Musica> getMusicas() {
        return musicas;
    }

    /**
     * @param musicas the musicas to set
     */
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }


   
    
}
