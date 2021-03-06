package br.com.cattany.study.repository;

import br.com.cattany.study.model.impl.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Bruno Cattany
 * @since 29/10/2018
 */
@RepositoryRestResource(path = "pessoas", collectionResourceRel = "pessoas")
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
