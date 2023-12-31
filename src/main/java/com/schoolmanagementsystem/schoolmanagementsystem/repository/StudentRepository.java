package com.schoolmanagementsystem.schoolmanagementsystem.repository;

import com.schoolmanagementsystem.schoolmanagementsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
