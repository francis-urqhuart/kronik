package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {



}
