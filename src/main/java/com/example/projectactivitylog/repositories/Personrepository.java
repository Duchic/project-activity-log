package com.example.projectactivitylog.repositories;

import com.example.projectactivitylog.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface Personrepository extends JpaRepository<PersonEntity, Integer> {
}
