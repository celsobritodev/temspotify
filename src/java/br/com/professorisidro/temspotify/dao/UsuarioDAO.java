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
        musica1.setArtitista("Iron Maiden");
        musica1.setTitulo("Wasted Years");
        musica1.setEstilo(1);
        musica1.setAlbum("Somewhere In Time");
        musica1.setLinkMP3("musicas/IronMaiden-WastedYears.mp3");
        
        musicas.add(musica1);
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
