package com.vpiusr.spring_data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

/*
JpaRepository<T, ID> is what's called generics in programming language concepts.
T here is the Entity while ID is the datatype for the identifier
Hence, JpaRepository<Student, Long> because Student is the Entity while Long is the datatype of id column
*/