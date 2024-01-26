package com.codegym.crud_database.repository;

import com.codegym.crud_database.model.Computer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends CrudRepository<Computer, Integer> {
    public List<Computer> getComputerByNameContaining(String name);
//    @Query("select c from Computer as c where c.name = ?1")
//    public List<Computer> findComputer(String name);


}
