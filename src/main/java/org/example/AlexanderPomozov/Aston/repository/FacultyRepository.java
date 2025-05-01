package org.example.AlexanderPomozov.Aston.repository;

import org.example.AlexanderPomozov.Aston.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Group, Long> {
}
