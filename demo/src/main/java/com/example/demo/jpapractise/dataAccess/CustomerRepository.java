package com.example.demo.jpapractise.dataAccess;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.jpapractise.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}

