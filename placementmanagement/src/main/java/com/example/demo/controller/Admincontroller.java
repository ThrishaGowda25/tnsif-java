package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Admin;
import com.example.demo.services.Adminservices;

@RestController
public class Admincontroller {

    @Autowired
    private Adminservices service;

    // CREATE
    @PostMapping("/saveadmin")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return service.saveAdmin(admin);
    }

    // READ ALL
    @GetMapping("/getadmins")
    public List<Admin> getAdmins() {
        return service.getAllAdmins();
    }

    // READ BY ID
    @GetMapping("/getadmin/{id}")
    public Optional<Admin> getAdmin(@PathVariable Long id) {
        return service.getAdminById(id);
    }

    // UPDATE
    @PutMapping("/updateadmin")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return service.updateAdmin(admin);
    }

    // DELETE
    @DeleteMapping("/deleteadmin/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        service.deleteAdmin(id);
        return "Admin deleted successfully";
    }
}