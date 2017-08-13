package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.User;

import java.util.List;

public interface UserRepository {

    List<User> findUsers(long max, int count);
}
