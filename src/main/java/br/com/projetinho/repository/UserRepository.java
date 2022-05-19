package br.com.projetinho.repository;

import br.com.projetinho.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
