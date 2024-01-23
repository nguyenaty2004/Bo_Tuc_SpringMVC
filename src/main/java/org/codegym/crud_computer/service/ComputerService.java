package org.codegym.crud_computer.service;

import org.codegym.crud_computer.model.Computer;
import org.codegym.crud_computer.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    public ComputerRepository computerRepository;
    public List<Computer> GetAllComputer(){
     return computerRepository.GetAllData();
    }
    public void AddComputer(Computer computer){
        computerRepository.AddComputer(computer);
    }
    public void RemoveComputer(int id){
        computerRepository.RemoveComputer(id);
    }
    public Computer findById(int id){
       return computerRepository.finByID(id);
    }
    public void update( Computer computer){
        computerRepository.updateComputer(computer);
    }

}
