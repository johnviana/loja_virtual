package com.lojavirtual.apploja.domain.services;

import com.lojavirtual.apploja.domain.model.Usuario;
import com.lojavirtual.apploja.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ImplentacaoUserDetailsService implements UserDetailsService{


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findUserbyLogin(username);

        if(usuario == null){
            throw new UsernameNotFoundException("Usuario não encontrado");
        }

        return new User(usuario.getLogin(), usuario.getPassword(), usuario.getAuthorities());
    }
}
