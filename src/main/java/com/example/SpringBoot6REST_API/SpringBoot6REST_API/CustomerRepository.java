package com.example.SpringBoot6REST_API.SpringBoot6REST_API;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}
