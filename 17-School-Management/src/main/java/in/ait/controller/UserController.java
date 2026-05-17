package in.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ait.entity.Users;
import in.ait.repo.USerRepo;
import in.ait.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private USerRepo repo;

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/saveUser")
	public String saveUser(Users user) {
		userService.saveUser(user);
		return "redirect:/register?login";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(String email, String password, Model model) {

		Users user = repo.findByEmail(email);

		if (user != null && user.getPassword().equals(password)) {
			return "dashboard";
		} else {
			model.addAttribute("error", "Invalid Email or Password");
			return "login";
		}
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
}
