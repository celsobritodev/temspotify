/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.professorisidro.temspotify.dao;

import br.com.professorisidro.temspotify.model.Musica;
import br.com.professorisidro.temspotify.model.PlayList;
import br.com.professorisidro.temspotify.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO implements GenericDAO {

    @Override
    public void create(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> read(Object o) {
        
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setEmail("isidro@professorisidro.com.br");
        usuario.setNome("Professor Isidro");
        usuario.setSenha("1234");
        
        ArrayList<PlayList> playLists = new ArrayList<>();
        PlayList playList1 = new PlayList();
        playList1.setId(1);
        playList1.setTitulo("Crassicos do Roqui");
        
        ArrayList<Musica> musicas = new ArrayList<>();
        Musica musica1 = new Musica();
        musica1.setId(1);
        musica1.setArtista("Iron Maiden");
        musica1.setTitulo("Wasted Years");
        musica1.setEstilo(1);
        musica1.setAlbum("Somewhere In Time");
        musica1.setLinkMP3("musicas/IronMaiden-WastedYears.mp3");
        
        Musica musica2 = new Musica();
        musica2.setId(2);
        musica2.setArtista("Scorpions");
        musica2.setTitulo("Rock You Like a Hurricane");
        musica2.setEstilo(1);
        musica2.setAlbum("Scorpions");
        musica2.setLinkMP3("musicas/Scorpions-RYLAH.mp3");
        
        
        Musica musica3 = new Musica();
        musica3.setId(3);
        musica3.setArtista("Peninha");
        musica3.setTitulo("Sonhos");
        musica3.setEstilo(2);
        musica3.setAlbum("MPB");
        musica3.setLinkMP3("musicas/Peninha-Sonhos.mp3");
        
        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);
        
        playList1.setMusicas(musicas);
        playLists.add(playList1);
        usuario.setPlaylists(playLists);
        
        ArrayList<Object> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        return usuarios;
    } 


    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
}

    
}
