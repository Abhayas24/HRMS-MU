package com.magadhUniversity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentDashBoardController
{
    @GetMapping("/")
    public String dashboard(Model model) {
        // Add dynamic student name to the model
        String studentName = "John Doe"; // Replace with dynamic data from the database or session
        model.addAttribute("studentName", studentName);
        return "student-dashboard"; // Returns the student-dashboard.html
    }

    @GetMapping("/student/attendance")
    public String viewAttendance() {
        // Redirect to attendance page
        return "student-attendance"; // student-attendance.html for attendance data
    }

    @GetMapping("/student/marks")
    public String viewMarks() {
        // Redirect to marks page
        return "student-marks"; // student-marks.html for marks data
    }

    @GetMapping("/student/profile")
    public String viewProfile() {
        // Redirect to profile page
        return "student-profile"; // student-profile.html for profile data
    }

    @GetMapping("/profile")
    public String profile() {
        // Redirect to general profile management
        return "profile"; // profile.html for general profile
    }

    @GetMapping("/logout")
    public String logout() {
        // Handle logout logic (e.g., clearing session) here if necessary
        return "redirect:/login"; // Redirect to login page
    }
}
