package in.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ait.entity.Student;
import in.ait.repo.StudentRepo;

@Controller
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/students")
	public String ViewAllStudents(Model model) {
		model.addAttribute("students", studentRepo.findAll());
		return "students";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Student student) {
		studentRepo.save(student);
		return "redirect:/students";
	}

	public String deleteStudent(@PathVariable Long id) {
		studentRepo.deleteById(id);
		return "redirect:/students";
	}
}
