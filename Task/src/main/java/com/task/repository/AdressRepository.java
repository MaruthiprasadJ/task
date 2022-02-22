package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.Adress;
@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
