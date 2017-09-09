package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {





}
