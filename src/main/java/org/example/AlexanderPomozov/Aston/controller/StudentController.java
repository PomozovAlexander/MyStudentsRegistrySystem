package org.example.AlexanderPomozov.Aston.controller;

import lombok.RequiredArgsConstructor;
import org.example.AlexanderPomozov.Aston.model.Student;
import org.example.AlexanderPomozov.Aston.repository.FacultyRepository;
import org.example.AlexanderPomozov.Aston.repository.GroupRepository;
import org.example.AlexanderPomozov.Aston.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor

public class StudentController {
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;
    private final FacultyRepository facultyRepository;


    @GetMapping ("/students")
    public String showStudents (Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }
    @GetMapping("/register")
    public String showRegistrationForm (Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("groups", groupRepository.findAll());
        return "register";
    }
        @PostMapping("/register")
        public String registerStudent(@ModelAttribute Student student) {
            studentRepository.save(student);
            return "redirect:/students";
        }

    }



