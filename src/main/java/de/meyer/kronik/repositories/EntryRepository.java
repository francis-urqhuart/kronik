package de.meyer.kronik.repositories;

import de.meyer.kronik.entities.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EntryRepository extends CrudRepository<Entry, Long> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Entry> getAllEntries() {
        Map<String, Object> params = new HashMap<String, Object>();
        List<Entry> result = jdbcTemplate.query("Select * from entries");
        return result;
    }

}
