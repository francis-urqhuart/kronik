package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByPseudonym(String username);

}
