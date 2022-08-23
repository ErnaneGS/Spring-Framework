package io.github.springdatarest.springdatarest.repositories;

import io.github.springdatarest.springdatarest.domains.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "userslist", path = "userslist")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
    List<Usuario> findByNome(@Param("nome") String nome);
}
