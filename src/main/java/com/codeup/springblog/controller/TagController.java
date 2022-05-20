package com.codeup.springblog.controller;

import com.codeup.springblog.models.Tag;
import com.codeup.springblog.repositories.TagRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tags")
public class TagController {
    private final TagRepository tagDao;

    public TagController(TagRepository tagDao) {
        this.tagDao = tagDao;
    }

    @GetMapping
    public String showTags(Model model){
        model.addAttribute("tags", tagDao.findAll());
        return "tags/index";
    }

    @GetMapping("/create")
    public String createTag(Model model){
        model.addAttribute("tag", new Tag());
        return "tags/create";
    }

    @PostMapping("/create")
    public String doCreateTag(
            @ModelAttribute Tag tag){
        tagDao.save(tag);
        return "redirect:/tags";
    }

    @GetMapping("/edit/{id}")
    public String editTag(
            @PathVariable long id, Model model){
        model.addAttribute("tags", tagDao.getById(id));
        return "tags/create";
    }

    @PostMapping("/edit")
    public String doEditTag(
            @ModelAttribute Tag tag){
        tagDao.save(tag);
        return "redirect:/tags";
    }

}
