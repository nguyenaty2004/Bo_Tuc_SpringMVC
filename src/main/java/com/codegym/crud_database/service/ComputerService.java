package com.codegym.crud_database.service;

import com.codegym.crud_database.model.Computer;
import com.codegym.crud_database.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;

    public List<Computer> getAllComputer() {
        return (List<Computer>) computerRepository.findAll();
    }

    public void add(Computer computer) {
        computerRepository.save(computer);
    }

    public void update(Computer computer) {
        Computer computerEdit = getComputerById(computer.getId());
        if (computerEdit != null) {
            computerEdit.setName(computer.getName());
            computerEdit.setPrice(computer.getPrice());
        }
        computerRepository.save(computer);
    }

    public Computer getComputerById(int id){
        return computerRepository.findById(id).get();
    }

    public void deleteById(int id) {
        Computer computerDelete = getComputerById(id);
        computerRepository.deleteById(id);
    }

    public List<Computer> search(String name) {
        return computerRepository.getComputerByNameContaining(name);
    }



}
