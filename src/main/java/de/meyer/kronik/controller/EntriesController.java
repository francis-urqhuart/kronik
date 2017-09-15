package de.meyer.kronik.controller;


import de.meyer.kronik.entities.Entry;
import de.meyer.kronik.repositories.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class EntriesController {

    private EntryRepository entryRepository;

    @Autowired
    public void setEntryRepository(EntryRepository er) {
        this.entryRepository = er;
    }

    @RequestMapping("/entries")
    public String showEntries(Model model) {

        model.addAttribute("entries", entryRepository.getAllEntries());

        return "showEntries";


    }

    @RequestMapping(value="/entries/createEntry", method = GET)
    public String createEntry() {

        return "createEntry";
    }

    @RequestMapping(value="entries/createEntry", method = POST)
    public String addEntry(Entry entry) {

        entry.setCreatedDate(Calendar.getInstance().getTime());
        entry.setLastModifiedDate(Calendar.getInstance().getTime());

        entryRepository.save(entry);

        return "showEntries";

    }





}


