package az.iktlab.groupsipweb.controller;

import az.iktlab.groupsipweb.model.Person;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private static final List<Person> people = new ArrayList<>();

    @PostMapping
    public void add(@RequestBody Person person) {
        people.add(person);

        System.out.println(people);
    }

    @PutMapping
    public void update(@RequestBody Person person) {
        people.forEach(it -> {
                    if (it.getId().equals(person.getId())) {
                        it.setAge(person.getAge());
                        it.setName(person.getName());
                        it.setSurname(person.getSurname());
                    }
                }
        );

        System.out.println(people);
    }

    // localhost:1244/people/1?name=Rza&surname=Rzayev
    @PatchMapping("/{id}")
    public void updateNameById(@PathVariable(value = "id") Long personId,
                               @PathVariable int age,
                               @RequestParam("name") String name,
                               @RequestParam(value = "surname",
                                       required = false,
                                       defaultValue = "NO SURNAME") String surname) {
        people.forEach(it -> {
            if (it.getId().equals(personId)) {
                it.setName(name);
                it.setSurname(surname);
            }
        });
    }


    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return people.stream()
                .filter(it -> it.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ID_NOT_FOUND"));
    }

    @GetMapping
    public List<Person> getAll() {
        return people;
    }

    @GetMapping("/filtered?id=5&name=Khayal&surname=farziyev")
    public List<Person> getFilteredPeople(@RequestBody Person person) {
//        return people.stream().filter(it -> it.getId() == person.getId());
        return people;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {

    }

    @DeleteMapping
    public void deleteAll() {
        people.clear();
    }
}
