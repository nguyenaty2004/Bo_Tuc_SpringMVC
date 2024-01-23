package org.codegym.crud_computer.repository;

import org.codegym.crud_computer.model.Computer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ComputerRepository {
    List<Computer> computerList = new ArrayList<Computer>();
    public ComputerRepository(){
        Computer computer = new Computer(1,"Macbook2018","hang chinh hang nha Apple",2100000,"Apple Silicon"," RTX 3080","Ram xin");
        Computer computer1 = new Computer(2,"Macbook2019","hang fake",2100000,"Apple Silicon"," RTX 3080","Ram xin");
        Computer computer2 = new Computer(3,"Macbook2020","hang qua tay",2100000,"Apple Silicon"," RTX 3080","Ram xin");
        Computer computer3 = new Computer(4,"Macbook2021","hang 99%",2100000,"Apple Silicon"," RTX 3080","Ram xin");
        Computer computer4 = new Computer(5,"Macbook2023","hang 98%",2100000,"Apple Silicon"," RTX 3080","Ram xin");
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
    }
    public List<Computer> GetAllData(){
        return computerList;
    }
    public void AddComputer(Computer computer){
        computerList.add(computer);
    }
    public void RemoveComputer(int id){
        Computer delete = finByID(id);
        if (computerList != null) {
            computerList.remove(delete);
        }
    }

    public Computer finByID(int id) {
        for (Computer computer : computerList){
            if (computer.getId() == id){
                return computer;
            }
        }
        return null;
    }
    public void updateComputer(Computer computer){
        Computer editcomputer = finByID(computer.getId());
        editcomputer.setName(computer.getName());
        editcomputer.setDetails(computer.getDetails());
        editcomputer.setPrice(computer.getPrice());
        editcomputer.setCPU(computer.getCPU());
        editcomputer.setGUP(computer.getGUP());
        editcomputer.setRam(computer.getRam());
    }
}

