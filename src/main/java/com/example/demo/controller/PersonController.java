package com.example.demo.controller;

import com.example.demo.Prefecture;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/personForm")
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("prefectures", Prefecture.getAllPrefectures());
        addCurrentTimeToModel(model);
        return "personForm";
    }

    @PostMapping("/personForm")
    public String submitForm(@ModelAttribute Person person) {
        personService.insert(person);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        addCurrentTimeToModel(model);
        return "success";
    }

    @GetMapping("/personList")
    public String showPersons(Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        addCurrentTimeToModel(model);
        return "personList";
    }

    private void addCurrentTimeToModel(Model model) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter);
        model.addAttribute("currentTime", formattedTime);
    }
}
