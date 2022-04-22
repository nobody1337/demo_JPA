package com.DemoJPA.demo_JPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
//create Simple Queries
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer>findByLastName(String lastName);

    Customer findById(long id);
}
