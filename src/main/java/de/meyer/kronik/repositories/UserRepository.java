package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByPseudonym(String pseudonym);

    User findbyId(Long id);

}
