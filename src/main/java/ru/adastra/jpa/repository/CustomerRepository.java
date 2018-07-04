package ru.adastra.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import ru.adastra.jpa.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}