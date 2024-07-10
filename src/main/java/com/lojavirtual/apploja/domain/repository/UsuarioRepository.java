package com.lojavirtual.apploja.domain.repository;

import com.lojavirtual.apploja.domain.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query(value = "select u from Usuario u.login = ?1")
        Usuario findUserbyLogin(String login);
}
