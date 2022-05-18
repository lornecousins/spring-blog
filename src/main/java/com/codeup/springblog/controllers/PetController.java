package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Pet;
import com.codeup.springblog.models.PetDetails;
import com.codeup.springblog.repositories.PetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PetController {

    private final PetRepository petsDao;

    public PetController(PetRepository petsDao) {
        this.petsDao = petsDao;
    }

    @GetMapping("/pets")
    @ResponseBody
    public List<Pet> returnPets() {
        return petsDao.findAll();
    }

    @GetMapping("/pets/update/{id}")
    public String returnPetsUpdateView(@PathVariable long id, Model model) {
        Pet pet = petsDao.getById(id);
        model.addAttribute("pet", pet);
        return "pets/test";
    }

    @PostMapping("/pets/update/{id}")
    public String updatePersonality(@PathVariable long id, @RequestParam String personality) {

        // get the correct pet object to update
        Pet pet = petsDao.getById(id);

        // get the current pet details
        PetDetails pd = pet.getPetDetails();

        // update the pet details with the current details
        pd.setPersonalityDescription(personality);
        pet.setPetDetails(pd);

        // update the database record
        petsDao.save(pet);

        return "redirect:/pets";
    }
}


