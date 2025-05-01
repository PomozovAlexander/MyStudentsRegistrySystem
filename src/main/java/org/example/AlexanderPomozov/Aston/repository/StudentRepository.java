package org.example.AlexanderPomozov.Aston.repository;

import org.example.AlexanderPomozov.Aston.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
