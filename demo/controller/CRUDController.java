package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.CRUD;
import com.example.demo.service.CRUDService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class CRUDController {

    @Autowired
    private CRUDService service;

    // ✅ Paginated GET
    @GetMapping
    public Page<CRUD> getAll(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size
    ) {
        return service.getAllUsersPaginated(page, size);
    }

    @GetMapping("/{id}")
    public CRUD get(@PathVariable Integer id) {
        return service.getUser(id);
    }

    @PostMapping
    public CRUD add(@RequestBody CRUD user) {
        return service.addUser(user);
    }

    @PutMapping("/{id}")
    public CRUD update(@PathVariable Integer id, @RequestBody CRUD user) {
        user.setId(id);
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteUser(id);
    }
}


