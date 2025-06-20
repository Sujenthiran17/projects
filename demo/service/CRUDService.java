package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.CRUD;
import com.example.demo.repo.UserRepository;

import java.util.List;

@Service
public class CRUDService {

    @Autowired
    private UserRepository repo;

    // ✅ Paginated method
    public Page<CRUD> getAllUsersPaginated(int page, int size) {
        return repo.findAll(PageRequest.of(page, size));
    }

    // Existing methods
    public List<CRUD> getAllUsers() { 
        return repo.findAll(); 
    }

    public CRUD getUser(Integer id) { 
        return repo.findById(id).orElse(null);
    }

    public CRUD addUser(CRUD user) {
        return repo.save(user); 
    }

    public CRUD updateUser(CRUD user) { 
        return repo.save(user); 
    }

    public void deleteUser(Integer id) { 
        repo.deleteById(id);
    }
}


