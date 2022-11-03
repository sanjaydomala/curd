package com.mongo.service;

import com.mongo.dto.StudentDto;
import com.mongo.dto.StudentExistingDto;
import com.mongo.dto.StudentNewDto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface StudentService {
//service application
    StudentDto addStudent(StudentNewDto studentNewDto);

    StudentDto updateStudent(StudentExistingDto studentExistingDto);

    void deleteStudent(String studentId);

    StudentDto getStudentById(String studentId);

    Page<StudentDto> getAllStudents(Pageable pageable);
}
