package de.meyer.kronik.controller;


import de.meyer.kronik.repositories.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntriesController {

    private EntryRepository er;

    @Autowired
    public void setEr(EntryRepository er) {
        this.er = er;
    }

    @RequestMapping("/entries")
    public String showEntries(Model model) {

      //  model.addAllAttributes("entries", er.findAll());

        return "showEntries";


    }






}


