package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class Adminservices {

    @Autowired
    private AdminRepository repository;

    // CREATE
    public Admin saveAdmin(Admin admin) {
        return repository.save(admin);
    }

    // READ ALL
    public List<Admin> getAllAdmins() {
        return (List<Admin>) repository.findAll();
    }

    // READ BY ID
    public Optional<Admin> getAdminById(Long id) {
        return repository.findById(id);
    }

    // UPDATE
    public Admin updateAdmin(Admin admin) {
        return repository.save(admin);
    }

    // DELETE
    public void deleteAdmin(Long id) {
        repository.deleteById(id);
    }

}