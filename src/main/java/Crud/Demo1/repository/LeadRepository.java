package Crud.Demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Crud.Demo1.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
